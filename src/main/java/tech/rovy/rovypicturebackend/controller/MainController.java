package tech.rovy.rovypicturebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.rovy.rovypicturebackend.common.BaseResponse;
import tech.rovy.rovypicturebackend.common.ResultUtils;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
//        测试自定义全局异常
//        int a = 5 / 0;
        return ResultUtils.success("ok");
    }
}

