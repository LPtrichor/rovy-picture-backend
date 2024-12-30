package tech.rovy.rovypicturebackend.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //自动生成一个包含所有字段的构造器，方便在创建对象时直接赋值
public class SpaceLevel {

    private int value;

    private String text;

    private long maxCount;

    private long maxSize;
}






