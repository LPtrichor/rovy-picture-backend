package tech.rovy.rovypicturebackend.model.dto.picture;

import java.io.Serializable;
import lombok.Data;

@Data
public class PictureUploadRequest implements Serializable {

    /**
     * 图片 id（用于修改）
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}

