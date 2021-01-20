
## Test Case Example

```java

package com.cg.iqgs.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.iqgs.model.PolicyQuestions;

class PolicyQuestionsRepoImplTest {

	IPolicyQuestionsRepository repo=new PolicyQuestionsRepoImpl();
	
	@Test
	void testCreatePolicyQuestions() {
		PolicyQuestions questions=new PolicyQuestions(polQuesId, polQuesSeq, polQuesDesc, polQuesAns1, polQuesAns2, polQuesAns3, polQuesAns4, polQuesAns1Weightage, polQuesAns2Weightage, polQuesAns3Weightage, polQuesAns4Weightage)
		PolicyQuestions savedQuestion=repo.createPolicyQuestions(policyQuetions);
		assertEquals(questions, savedQuestion);
	}

	@Test
	void testUpdatePolicyQuestions() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPolicyQuestionsById() {
		fail("Not yet implemented");
	}

	@Test
	void testDeletePolicyQuestions() {
		fail("Not yet implemented");
	}

}


```
