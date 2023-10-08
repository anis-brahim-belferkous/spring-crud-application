package hu.meiit.fistapp.service.impl;

import hu.meiit.fistapp.repository.subject;
import hu.meiit.fistapp.repository.subjectRepository;
import hu.meiit.fistapp.service.subjectVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class subjectServiceIml implements hu.meiit.fistapp.service.subjectService {
    private  final subjectRepository SubjectRepo;

    @Override
    public Long insertSubject(subjectVO sub) {
        subject newSubject = SubjectRepo.save(sub.toEntity());
        return newSubject.getId();
    }
}
