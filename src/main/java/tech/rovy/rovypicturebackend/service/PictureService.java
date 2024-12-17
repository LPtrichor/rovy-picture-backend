package tech.rovy.rovypicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.multipart.MultipartFile;
import tech.rovy.rovypicturebackend.model.dto.picture.PictureQueryRequest;
import tech.rovy.rovypicturebackend.model.dto.picture.PictureReviewRequest;
import tech.rovy.rovypicturebackend.model.dto.picture.PictureUploadByBatchRequest;
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

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 验证图片
     * @param picture
     */
    void validPicture(Picture picture);

    /**
     * 分页查询图片
     * @param picturePage
     * @param request
     * @return
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 获取图片VO
     * @param picture
     * @param request
     * @return
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 获取查询条件
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 上传图片
     *
     * @param inputSource
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(Object inputSource, PictureUploadRequest pictureUploadRequest, User loginUser);

    void fillReviewParams(Picture picture, User loginUser);
}
