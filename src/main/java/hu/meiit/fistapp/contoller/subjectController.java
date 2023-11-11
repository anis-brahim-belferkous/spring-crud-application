package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.service.subjectService;
import hu.meiit.fistapp.service.subjectVO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class subjectController {

    public final subjectService subjectService;


    @PostMapping(path = "/subject")
    public Long insertSubject(@RequestBody subjectDto subjectDto){
        return subjectService.insertSubject(subjectDto.toVO());
    }

    @GetMapping(path = "/subject/{id}")
    public Long selectSubject(@PathVariable("id") Long ID){
        return subjectService.selectSubject(ID).getId();
    }
    @PutMapping(path = "/subject/{id}")
    public Long updateSubject(@RequestBody subjectDto subjectDto,@PathVariable("id") Long ID){
        return subjectService.UpdateSubject(subjectDto.toVO(),ID);
    }

    @DeleteMapping(path = "/subject/{id}")
    public Long deleteSubject(@PathVariable("id") Long ID){
        return subjectService.DeleteSubject(ID);
    }
}
