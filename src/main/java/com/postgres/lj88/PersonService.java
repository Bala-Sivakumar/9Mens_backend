package com.postgres.lj88;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgres.lj88.model.Person;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void addPerson(List<Person> persons) {
        personRepository.saveAll(persons);
    }
    
    
    public List<ShareDto> getPersonsBySharedWith(String sharedWith) {
    	List<Person> details = personRepository.findBySharedWith(sharedWith);
    	List<ShareDto> itemList = new ArrayList<>();
    	Map<String, Integer> spenderShareMap = new HashMap<>();

    	for (Person p : details) {
            String spender = p.getSpender();
            int shareAmount = (int) p.getShare_amount();

            // Update the spenderShareMap
            if (spenderShareMap.containsKey(spender)) {
                int currentAmount = spenderShareMap.get(spender);
                spenderShareMap.put(spender, currentAmount + shareAmount);
            } else {
                spenderShareMap.put(spender, shareAmount);
            }
        }
    	
    	for (Map.Entry<String, Integer> entry : spenderShareMap.entrySet()) {
            String name = entry.getKey();
            Integer value = entry.getValue();
            itemList.add(new ShareDto(name, value));
        }
        return itemList;
    }
    
}
