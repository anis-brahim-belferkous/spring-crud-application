package hu.meiit.fistapp.service.impl;

import hu.meiit.fistapp.repository.People;
import hu.meiit.fistapp.repository.PeopleRepository;
import hu.meiit.fistapp.service.PeopleVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PeopleServiceIml implements hu.meiit.fistapp.service.PeopleService {
    private  final PeopleRepository  peopleRepository;

    @Override
    public Long insertPeople(PeopleVO people) {
        People newPeople=  peopleRepository.save(people.toEntity());
        return newPeople.getId();
    }
}
