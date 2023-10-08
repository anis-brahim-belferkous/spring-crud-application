package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.service.subjectService;
import hu.meiit.fistapp.service.subjectVO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class subjectController {

    public final subjectService subjectService;


    @PostMapping(path = "/subject")
    public Long insertSubject(@RequestBody subjectDto subjectDto){
        return subjectService.insertSubject(subjectDto.toVO());
    }
}
