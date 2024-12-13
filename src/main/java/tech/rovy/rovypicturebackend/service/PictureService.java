package tech.rovy.rovypicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.multipart.MultipartFile;
import tech.rovy.rovypicturebackend.model.dto.picture.PictureQueryRequest;
import tech.rovy.rovypicturebackend.model.dto.picture.PictureUploadRequest;
import tech.rovy.rovypicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import tech.rovy.rovypicturebackend.model.entity.User;
import tech.rovy.rovypicturebackend.model.vo.PictureVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author rovy
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2024-12-12 16:13:48
*/
public interface PictureService extends IService<Picture> {

    void validPicture(Picture picture);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

}
