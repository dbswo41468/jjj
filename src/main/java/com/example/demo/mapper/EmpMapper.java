package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVo;
import com.example.demo.vo.UsersVO;

/*
 * 추상 클래스와 인터페이스 차이점
 * 
 * 인터페이스 : 메소드 정의
 * 추상 클래스 : 정의, 구현 가능
 * 
 */


@Mapper
public interface EmpMapper {
	
	// 메소드 이름 클릭 -> 알트 쉬프트 j 
	/**
	 * @Since : 2022. 11. 28.
	 * @Author : 미스터 빈
	 * @Return : List<EmpVo> 	
	 * @comment : EMP 테이블 전체 조회
	 */
	List<EmpVo> selectEmp(); // 메소드 정의
	
	
	
	/**
	 * @Since : 2022. 11. 29.
	 * @Author : 미스터 빈
	 * @Return : List<DeptVO> 	
	 * @comment : Dept 테이블 전체 조회
	 */
	List<DeptVO> selectDept();
	
	int insertEmp(EmpVo vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : 미스터 빈
	 * @Return : int 	
	 * @comment : 
	 */
	int deleteEmp(int empno);
	
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : 미스터 빈
	 * @Return : int 	
	 * @comment : 
	 */
	int insertDept (DeptVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : 미스터 빈
	 * @Return : int 	
	 * @comment : 사원 삭제
	 */
	int deleteDept(int deptno);
	
	
	// 인서트 업데이트가 많으면 객체로 ㄱㄱㅎ
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : 미스터 빈
	 * @Return : int 	
	 * @comment : 사원정보 수정
	 */
	int updateEmp(EmpVo vo);

	/**
	 * @Since : 2022. 12. 1.
	 * @Author : 미스터 빈
	 * @Return : int 	
	 * @comment : dept 수정
	 */
	int updateDept(DeptVO vo);
	
	
	// 회원가입
	int insertUsers(UsersVO vo);
	
	// 로그인
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : 미스터 빈
	 * @Return : int 	
	 * @comment : 회원인지 아닌지 체크
	 */
	int selectUsersFindById(UsersVO vo);
	
	//삭제
	int deleteUsers(String id);
	
	// 찾기
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : 미스터 빈
	 * @Return : List<UsersVO> 	
	 * @comment : 찾기
	 */
	List<UsersVO> selectUsers();
}
