package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import vo.FaqVO;

public class FaqDAO {
	
	SqlSession sqlSession;
	
	public FaqDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	// 전체 게시글 조회
	public List<FaqVO> selectlist(){
		List<FaqVO> list = sqlSession.selectList("f.faq_list");
		return list;
	}

}
