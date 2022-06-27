package com.vtiger.documents;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sdet34l1.genericUtility.BaseClass;
import com.sdet34l1.genericUtility.ExcelOffice;
import com.sdet34l1.genericUtility.JavaOffice;
import com.sdet34l1.genericUtility.WebDriverOffice;
import com.vtiger.ObjectRepository.CreateNewDocumentPage;
import com.vtiger.ObjectRepository.DocumentPage;

public class CreatedocumentsTest extends BaseClass{ 
	@Test(groups = {"Regression","Sanity"})
	public void createdocumentsFrameTest() throws EncryptedDocumentException, IOException, InterruptedException {
		String documents = ExcelOffice.getDataFromExcel("Documents", 2, 1)+JavaOffice.getRandomnumber(1000);
		String documents1 = ExcelOffice.getDataFromExcel("Documents", 2, 2);
		homepage.homePageDocumentLink();
		DocumentPage docu = new DocumentPage(driver);
		docu.documentPageAction();
		CreateNewDocumentPage newDocPage=new CreateNewDocumentPage(driver);
		newDocPage.documentPageSendTitle(documents);
		WebDriverOffice.switchToFrame(driver, 0);
		newDocPage.documentPageSendTextAndCopyAll(documents1);
		WebDriverOffice.switchBackToHomepage(driver);
		newDocPage.documentPageBoldAndItalicText();
		newDocPage.documentPageFileUpload("C:\\Users\\VAISHALI\\Desktop\\LOC.png");
		JavaOffice.printStatement(documents1);
		Reporter.log("all done");
	}
}
