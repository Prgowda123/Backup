//package steno;
//
//import org.testng.annotations.Test;
//
//public class App_post {
//	
//	@Test
//	public void sam()
//	{
//	{{
//		  "applicationNo": 0,
//		  "fullName": "string",
//		  "fatherName": "string",
//		  "motherName": "string",
//		  "mobileNo": "string",
//		  "emailId": "string",
//		  "aadharNo": "string",
//		  "dateOfBirth": "2025-02-24T05:15:48.219Z",
//		  "identificationMark_01": "string",
//		  "identificationMark_02": "string",
//		  "nativeDistrict": "string",
//		  "identityCardTypeCode": "string",
//		  "uploadedIDNo": "string",
//		  "postCode": "string",
//		  "postUnitCode": "string",
//		  "visitorId": 0,
//		  "contactAddress": {
//		    "applicationNo": 0,
//		    "doorNo": "string",
//		    "street": "string",
//		    "landmark": "string",
//		    "taluk": "string",
//		    "city": "string",
//		    "districtCode": "string",
//		    "otherDistrictName": "string",
//		    "unionStateCode": "string",
//		    "pincode": "string",
//		    "isPermanentAddressSame": true,
//		      "code": "string",
//		      "name": "string",
//		      "orderIndex": 0,
//		      "districts": [
//		        "string"
//		      ],
//		      "contactAddresses": [
//		        "string"
//		      ],
//		      "permanentAddresses": [
//		        "string"
//		      ]
//		    }
//		  },
//		  "criminalActivity": {
//		    "applicationNo": 0,
//		    "isInvolvedInCriminalActivity": true,
//		    "caseDetail": "string",
//		    "isConvictedInCriminalCase": true,
//		    "convictionDetail": "string",
//		      "applicationNo": 0,
//		      "fullName": "string",
//		      "fatherName": "string",
//		      "motherName": "string",
//		      "mobileNo": "string",
//		      "emailId": "string",
//		      "aadharNo": "string",
//		      "dateOfBirth": "2025-02-24T05:15:48.219Z",
//		      "identificationMark_01": "string",
//		      "identificationMark_02": "string",
//		      "nativeDistrict": "string",
//		      "identityCardTypeCode": "string",
//		      "uploadedIDNo": "string",
//		      "postCode": "string",
//		      "postUnitCode": "string",
//		      "visitorId": 0,
//		      "post": {
//		        "code": "string",
//		        "title_Eng": "string",
//		        "title_Lng": "string",
//		        "notificationNo_Eng": "string",
//		        "notificationNo_Lng": "string",
//		        "vacancy": 0,
//		        "applicationStartDate": "2025-02-24T05:15:48.219Z",
//		        "applicationEndDate": "2025-02-24T05:15:48.219Z",
//		        "applicationNoGenerationMode": 0,
//		        "genders": [
//		          "string"
//		        ],
//		        "identityCardTypes": [
//		          {
//		            "code": "string",
//		            "title": "string",
//		            "orderIndex": 0,
//		            "postCode": "string",
//		            "post": "string",
//		            "applicants": [
//		              "string"
//		            ]
//		          }
//		        ],
//		        "postMenus": [
//		          {
//		            "code": "string",
//		            "title": "string",
//		            "displayTitle": "string",
//		            "url": "string",
//		            "status": "string",
//		            "postCode": "string",
//		            "post": "string"
//		          }
//		        ],
//		        "recruitmentActivities": [
//		          "string"
//		        ],
//		        "applicants": [
//		          "string"
//		        ],
//		        "homePageContents": [
//		          {
//		            "postCode": "string",
//		            "keyDates": "string",
//		            "ageCriteria": "string",
//		            "paymentDetail": "string",
//		            "notes": "string",
//		            "post": "string"
//		          }
//		        ],
//		        "postUnits": [
//		          {
//		            "code": "string",
//		            "title": "string",
//		            "startingApplicationNo": 0,
//		            "currentApplicationNo": 0,
//		            "endApplicationNo": 0,
//		            "postCode": "string",
//		            "orderIndex": 0,
//		            "vacancy": 0,
//		            "post": "string",
//		            "categories": [
//		              "string"
//		            ],
//		            "postUnitQualifications": [
//		              "string"
//		            ],
//		            "applicants": [
//		              "string"
//		            ]
//		          }
//		        ]
//		      },
//		      "unit": {
//		        "code": "string",
//		        "title": "string",
//		        "startingApplicationNo": 0,
//		        "currentApplicationNo": 0,
//		        "endApplicationNo": 0,
//		        "postCode": "string",
//		        "orderIndex": 0,
//		        "vacancy": 0,
//		        "post": "string",
//		        "categories": [
//		          "string"
//		        ],
//		        "postUnitQualifications": [
//		          "string"
//		        ],
//		        "applicants": [
//		          "string"
//		        ]
//		      },
//		      "identityCardType": {
//		        "code": "string",
//		        "title": "string",
//		        "orderIndex": 0,
//		        "postCode": "string",
//		        "post": "string",
//		        "applicants": [
//		          "string"
//		        ]
//		      },
//		      "visitor": {
//		        "id": 0,
//		        "ipAddress": "string",
//		        "browser": "string",
//		        "device": "string",
//		        "visitedOn": "2025-02-24T05:15:48.219Z",
//		        "applicants": [
//		          "string"
//		        ],
//		        "downloads": [
//		          "string"
//		        ]
//		      },
//		      "contactAddress": "string",
//		      "criminalActivity": "string",
//		      "educationalQualification": "string",
//		      "reservation": "string",
//		      "permanentAddress": "string",
//		      "stenographerAssistant": "string",
//		      "typistAssistant": "string",
//		      "downloads": [
//		        "string"
//		      ],
//		      "eligibilityStatuses": [
//		        "string"
//		      ],
//		      "uploads": [
//		        "string"
//		      ]
//		    }
//		  },
//		  "educationalQualification": {
//		    "applicationNo": 0,
//		    "isSSLCHolder": true,
//		    "isPUCHolder": true,
//		    "isDegreeHolder": true,
//		    "isPostDegreeHolder": true,
//		    "isPhdHolder": true,
//		      "applicationNo": 0,
//		      "fullName": "string",
//		      "fatherName": "string",
//		      "motherName": "string",
//		      "mobileNo": "string",
//		      "emailId": "string",
//		      "aadharNo": "string",
//		      "dateOfBirth": "2025-02-24T05:15:48.219Z",
//		      "identificationMark_01": "string",
//		      "identificationMark_02": "string",
//		      "nativeDistrict": "string",
//		      "identityCardTypeCode": "string",
//		      "uploadedIDNo": "string",
//		      "postCode": "string",
//		      "postUnitCode": "string",
//		      "visitorId": 0,
//		      "post": {
//		        "code": "string",
//		        "title_Eng": "string",
//		        "title_Lng": "string",
//		        "notificationNo_Eng": "string",
//		        "notificationNo_Lng": "string",
//		        "vacancy": 0,
//		        "applicationStartDate": "2025-02-24T05:15:48.219Z",
//		        "applicationEndDate": "2025-02-24T05:15:48.219Z",
//		        "applicationNoGenerationMode": 0,
//		        "genders": [
//		          "string"
//		        ],
//		        "identityCardTypes": [
//		          {
//		            "code": "string",
//		            "title": "string",
//		            "orderIndex": 0,
//		            "postCode": "string",
//		            "post": "string",
//		            "applicants": [
//		              "string"
//		            ]
//		          }
//		        ],
//		        "postMenus": [
//		          {
//		            "code": "string",
//		            "title": "string",
//		            "displayTitle": "string",
//		            "url": "string",
//		            "status": "string",
//		            "postCode": "string",
//		            "post": "string"
//		          }
//		        ],
//		        "recruitmentActivities": [
//		          "string"
//		        ],
//		        "applicants": [
//		          "string"
//		        ],
//		        "homePageContents": [
//		          {
//		            "postCode": "string",
//		            "keyDates": "string",
//		            "ageCriteria": "string",
//		            "paymentDetail": "string",
//		            "notes": "string",
//		            "post": "string"
//		          }
//		        ],
//		        "postUnits": [
//		          {
//		            "code": "string",
//		            "title": "string",
//		            "startingApplicationNo": 0,
//		            "currentApplicationNo": 0,
//		            "endApplicationNo": 0,
//		            "postCode": "string",
//		            "orderIndex": 0,
//		            "vacancy": 0,
//		            "post": "string",
//		            "categories": [
//		              "string"
//		            ],
//		            "postUnitQualifications": [
//		              "string"
//		            ],
//		            "applicants": [
//		              "string"
//		            ]
//		          }
//		        ]
//		      },
//		      "unit": {
//		        "code": "string",
//		        "title": "string",
//		        "startingApplicationNo": 0,
//		        "currentApplicationNo": 0,
//		        "endApplicationNo": 0,
//		        "postCode": "string",
//		        "orderIndex": 0,
//		        "vacancy": 0,
//		        "post": "string",
//		        "categories": [
//		          "string"
//		        ],
//		        "postUnitQualifications": [
//		          "string"
//		        ],
//		        "applicants": [
//		          "string"
//		        ]
//		      },
//		      "identityCardType": {
//		        "code": "string",
//		        "title": "string",
//		        "orderIndex": 0,
//		        "postCode": "string",
//		        "post": "string",
//		        "applicants": [
//		          "string"
//		        ]
//		      },
//		      "visitor": {
//		        "id": 0,
//		        "ipAddress": "string",
//		        "browser": "string",
//		        "device": "string",
//		        "visitedOn": "2025-02-24T05:15:48.219Z",
//		        "applicants": [
//		          "string"
//		        ],
//		        "downloads": [
//		          "string"
//		        ]
//		      },
//		      "contactAddress": "string",
//		      "criminalActivity": "string",
//		      "educationalQualification": "string",
//		      "reservation": "string",
//		      "permanentAddress": "string",
//		      "stenographerAssistant": "string",
//		      "typistAssistant": "string",
//		      "downloads": [
//		        "string"
//		      ],
//		      "eligibilityStatuses": [
//		        "string"
//		      ],
//		      "uploads": [
//		        "string"
//		      ]
//		    },
//		    "sslcQualification": {
//		      "applicationNo": 0,
//		      "qualificationBoardCode": "string",
//		      "otherBoardName": "string",
//		      "registrationNo": "string",
//		      "kannadaLanguagePaper": "string",
//		      "yearOfPassing": "string",
//		      "markType": "string",
//		      "scoredPercentage": 0,
//		      "educationalQualification": "string",
//		        "code": "string",
//		        "title": "string",
//		        "isEquivalent": true,
//		        "orderIndex": 0,
//		        "isApplicableForPUC": true,
//		        "isApplicableForSSLC": true,
//		        "pucQualification": [
//		          "string"
//		        ],
//		        "sslcQualification": [
//		          "string"
//		        ]
//		      },
//		        "code": "string",
//		        "title": "string",
//		        "sslcQualification": [
//		          "string"
//		        ]
//		      },
//		      "grade": {
//		        "applicationNo": 0,
//		        "grade": "string",
//		       },
//		      "score": {
//		        "applicationNo": 0,
//		        "maximum": 0,
//		        "obtained": 0,
//		       }
//		    },
//		    "pucQualification": {
//		      "applicationNo": 0,
//		      "qualificationBoardCode": "string",
//		      "otherBoardName": "string",
//		      "registrationNo": "string",
//		      "yearOfPassing": "string",
//		      "markType": "string",
//		      "scorePercentage": 0,
//		      "hasPassedFromNIOS_PUCBoard": true,
//		      "isBridgeCourseFromKSOU": true,
//		      "educationalQualification": "string",
//		        "code": "string",
//		        "title": "string",
//		        "isEquivalent": true,
//		        "orderIndex": 0,
//		        "isApplicableForPUC": true,
//		        "isApplicableForSSLC": true,
//		        "pucQualification": [
//		          "string"
//		        ],
//		        "sslcQualification": [
//		          "string"
//		        ]
//		      },
//		      "grade": {
//		        "applicationNo": 0,
//		        "grade": "string",
//		      },
//		      "score": {
//		        "applicationNo": 0,
//		        "maximum": 0,
//		        "obtained": 0,
//		      }
//		    }
//		  },
//		  "reservation": {
//		    "applicationNo": 0,
//		    "categoryCode": "string",
//		    "subCaste": "string",
//		    "categoryCertificateIssuedDate": "2025-02-24T05:15:48.219Z",
//		    "genderCode": "string",
//		    "areYouAGovermentEmployee": true,
//		    "govermentServiceDetail": {
//		      "applicationNo": 0,
//		      "department": "string",
//		      "designation": "string",
//		      "yearsInService": 0,
//		      "monthsInService": 0,
//		      "daysInService": 0,
//		      "hasDepartmentEnquiry": true,
//		      "departmentEnquiryDetail": "string",
//		      "joiningDate": "2025-02-24T05:15:48.219Z",
//		      "reservation": "string"
//		    }
//		  },
//		  "permanentAddress": {
//		    "applicationNo": 0,
//		    "doorNo": "string",
//		    "street": "string",
//		    "landmark": "string",
//		    "taluk": "string",
//		    "city": "string",
//		    "districtCode": "string",
//		    "otherDistrictName": "string",
//		    "unionStateCode": "string",
//		    "pincode": "string",
//		  },
//		  "stenographerAssistant": {
//		    "applicationNo": 0,
//		    "isPassedInQualifyExam": true,
//		    "qualificationCode": "string",
//		  },
//		  "typistAssistant": {
//		    "applicationNo": 0,
//		    "isPassedInQualifyExam": true,
//		    "qualificationCode": "string",
//		  },
//		  "uploads": [
//		    {
//		      "id": 0,
//		      "applicationNo": 0,
//		      "documentTypeCode": "string",
//		      "documentPath": "string",
//		      "orderIndex": 0,
//		    }
//		  ]
//		}}
//}
//}