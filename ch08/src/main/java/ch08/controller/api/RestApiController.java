package ch08.controller.api;

import ch08.dto.JsonResult;
import ch08.vo.UserVo;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/api/user")
public class RestApiController {

    @PostMapping
    public JsonResult create(@RequestBody UserVo vo) {
        vo.setNo(10L);
        vo.setPassword("");

        return JsonResult.success(vo);
    }

    @GetMapping
    public JsonResult read() {
        return JsonResult.success(Arrays.asList(
                new UserVo(1L, "둘리"),
                new UserVo(2L, "마이콜"),
                new UserVo(3L, "또치")
        ));
    }

    @PutMapping("/{no}")
    public JsonResult update(@PathVariable("no") Long no, @RequestBody UserVo vo) {
        vo.setNo(no);
        vo.setPassword("");

        return JsonResult.success(vo);
    }

    @DeleteMapping("/{no}")
    public JsonResult delete(@PathVariable("no") Long no, @RequestParam(value="password", required = true, defaultValue = "") String password) {
        System.out.println("password:" + password);
        return JsonResult.success(no);
    }
}
