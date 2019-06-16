package com.wdl.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: SimpleController</p>
 * <p>Description: TODO</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: sodo</p>
 *
 * @author wangdali
 * @version 1.0
 * @date 2019/6/16 23:06
 */
@RestController
public class SimpleRestController {

    @GetMapping("hello")
    public String helloWorld(){
        return "hello,welcome test jenkins";
    }

}
