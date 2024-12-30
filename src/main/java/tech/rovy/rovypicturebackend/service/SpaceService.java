package tech.rovy.rovypicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import tech.rovy.rovypicturebackend.model.dto.space.SpaceAddRequest;
import tech.rovy.rovypicturebackend.model.dto.space.SpaceQueryRequest;
import tech.rovy.rovypicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import tech.rovy.rovypicturebackend.model.entity.User;
import tech.rovy.rovypicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author rovy
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2024-12-28 14:39:30
*/
public interface SpaceService extends IService<Space> {

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    void validSpace(Space space, boolean add);

    void fillSpaceBySpaceLevel(Space space);

    /**
     * 获取查询对象
     *
     * @param spaceQueryRequest
     * @return
     */
    Wrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 获取空间包装类（单条）
     *
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间包装类（分页）
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);
}
