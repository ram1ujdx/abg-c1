package com.cg.policy.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.policy.model.PolicyQuestions;




public class PolicyQuestionsRepoImpl{
	PreparedStatement psmt;
	ResultSet pResultSet;
	Connection connection;
	public PolicyQuestionsRepoImpl() {
		try {
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","password");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<PolicyQuestions> getPolicyQuestionsBySeq(String polQuesId) throws SQLException
	
		{
			psmt=connection.prepareStatement("select * from Policy_Questions where Pol_Ques_Id=?");
			psmt.setString(1, polQuesId);
			pResultSet=psmt.executeQuery();
//			if(!pResultSet.next()) {
//				throw new RuntimeException("Policy Question with Id ["+polQuesId+"] does not exist");
//			}
			List<PolicyQuestions> policyQues=new ArrayList<>();
			while(pResultSet.next()) {
			PolicyQuestions policyQuestions=new PolicyQuestions();
			
			policyQuestions.setPolQuesId(pResultSet.getString("POL_QUES_ID"));
			policyQuestions.setPolQuesSeq(pResultSet.getInt("POL_QUES_SEQ"));
			policyQuestions.setPolQuesDesc(pResultSet.getString("POL_QUES_DESC"));
			policyQuestions.setPolQuesAns1(pResultSet.getString("POL_QUES_ANS1"));
			policyQuestions.setPolQuesAns2(pResultSet.getString("POL_QUES_ANS2"));
			policyQuestions.setPolQuesAns3(pResultSet.getString("POL_QUES_ANS3"));
			policyQuestions.setPolQuesAns4(pResultSet.getString("POL_QUES_ANS4"));
			policyQuestions.setPolQuesAns1Weightage(pResultSet.getInt("POL_QUES_ANS1_WEIGHTAGE"));
			policyQuestions.setPolQuesAns2Weightage(pResultSet.getInt("POL_QUES_ANS2_WEIGHTAGE"));
			policyQuestions.setPolQuesAns3Weightage(pResultSet.getInt("POL_QUES_ANS3_WEIGHTAGE"));
			policyQuestions.setPolQuesAns4Weightage(pResultSet.getInt("POL_QUES_ANS4_WEIGHTAGE"));
			policyQues.add(policyQuestions);
			}
		    return policyQues;
		}
	
	
	
	
}