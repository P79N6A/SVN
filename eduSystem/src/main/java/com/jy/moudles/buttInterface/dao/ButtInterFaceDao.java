package com.jy.moudles.buttInterface.dao;
import java.util.List;
import java.util.Map;

import com.jy.common.persistence.annotation.MyBatisDao;
import com.jy.moudles.buttInterface.entity.StudentExam;
import com.jy.moudles.buttInterface.entity.TwoWaySpecificationDetailNew;
import com.jy.moudles.exam.entity.Exam;
import com.jy.moudles.teacher.entity.Teacher;

@MyBatisDao
public interface ButtInterFaceDao {
	/**
	 * 根据条件查询考试信息
	 * @param exam
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年1月25日 下午1:43:13
	 */
	public List<Exam> queryExamInfoMsg(Map<String,Object> param);
	
	/**
	 * 根据条件查询场考试的所有科目双向细目表
	 * @param param
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年1月26日 上午9:42:46
	 */
	public List<TwoWaySpecificationDetailNew> queryTwoWaySpecificationMsg(Map<String,Object> param);
	
	/**
	 * 根据条件查询教师信息
	 * @param param
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年1月26日 上午10:28:35
	 */
	public List<Teacher> queryTeachermsg(Map<String,Object> param);
	
	/**
	 * 学生考试信息
	 * @param param
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年1月26日 下午2:06:14
	 */
	public List<StudentExam> queryStudentExamMsg(Map<String,Object> param);
	
	/**
	 * 修改考试信息
	 * @param param
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年1月30日 下午1:48:46
	 */
	public int updateExamInfo(Map<String,Object> param);
	
	/**
	 * 批量插入分数表数据
	 * @param param
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年1月31日 下午5:16:52
	 */
	public int beatchInsertScores(List<Map<String,Object>> list);
	
	/**
	 * 批量插入分步信息
	 * @param list
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年2月1日 上午9:22:48
	 */
	public int beatchInsertSpecificationDetailStep(List<Map<String,Object>> list);
	
	/**
	 * 批量插入双向表详情信息
	 * @param list
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年2月1日 上午10:48:46
	 */
	public int beatchInsertSpecificationDetail(List<Map<String,Object>> list);
	
	/**
	 * 批量插入双向表信息
	 * @param list
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年2月1日 上午10:51:42
	 */
	public int beatchInsertSpecification(List<Map<String,Object>> list);
	
	/**
	 * 批量插入 考试双向细目表关系表
	 * @param list
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年2月1日 上午10:54:44
	 */
	public int beatchInsertSpecificationRelation(List<Map<String,Object>> list);
	
	/**
	 * 修改考试双向细目表关系表
	 * @param param
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年2月6日 下午3:32:04
	 */
	public int updateExamSpecificationRelation(Map<String,Object> param);
	
	/**
	 * 删除接收的考试关联双向表等信息
	 * @param param
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年2月7日 上午9:00:38
	 */
	public int deleteSpecificationRelation(Map<String,Object> param);
	
	/**
	 * 删除某场考试的分数信息
	 * @param param
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年2月7日 上午9:38:55
	 */
	public int deleteScore(Map<String,Object> param);
	
	/**
	 * 修改考试状态 定时任务用 
	 * @return
	 * @author 黄忠柳
	 * Create on 2018年2月8日 上午10:04:06
	 */
	public int updateExamStatus();
}
