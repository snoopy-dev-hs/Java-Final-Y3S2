/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_machine_transaction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Heng-Sok
 */
public class ClsGetDataFile {

    private String accNo;
    private String accId = "";
    private String accName = "";
    private String accPwd = "";
    private int accBalance = 0;
    private String accStatus = "";
    private int accNumOfLine = 0;
    private String userId = "";
    
    /// Get File to Read
    File dataFile = new File("src/atm_machine_transaction/data.txt");
    

    

    ClsGetDataFile(String accNo) {
        this.userId = accNo;
    }

    public void getAllData() throws FileNotFoundException {
        /// Read a File and Get Data from File
        Scanner readData = new Scanner(dataFile);
        /// Get Line Number of File
        int numOfLine = 0;
        while (readData.hasNextLine()) {
            String data = readData.nextLine();
            numOfLine += 1;
            String[] spData = data.split("@@", 10);
            if (spData[2].equals(userId)) {
                this.accId = (spData[0]);
                this.accName = spData[1];
                this.accNo = spData[2];
                this.accPwd = spData[3];
                this.accBalance = Integer.parseInt(spData[4]);
                this.accStatus = spData[5];
                this.accNumOfLine = numOfLine;
            }
        }
    }

    /**
     * @return the accNo
     */
    public String getAccNo() {
        return accNo;
    }

    /**
     * @param accNo the accNo to set
     */
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    /**
     * @return the accId
     */
    public String getAccId() {
        return accId;
    }

    /**
     * @param accId the accId to set
     */
    public void setAccId(String accId) {
        this.accId = accId;
    }

    /**
     * @return the accName
     */
    public String getAccName() {
        return accName;
    }

    /**
     * @param accName the accName to set
     */
    public void setAccName(String accName) {
        this.accName = accName;
    }

    /**
     * @return the accPwd
     */
    public String getAccPwd() {
        return accPwd;
    }

    /**
     * @param accPwd the accPwd to set
     */
    public void setAccPwd(String accPwd) {
        this.accPwd = accPwd;
    }

    /**
     * @return the accBalance
     */
    public int getAccBalance() {
        return accBalance;
    }

    /**
     * @param accBalance the accBalance to set
     */
    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    /**
     * @return the accStatus
     */
    public String getAccStatus() {
        return accStatus;
    }

    /**
     * @param accStatus the accStatus to set
     */
    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    /**
     * @return the accNumOfLine
     */
    public int getAccNumOfLine() {
        return accNumOfLine;
    }

    /**
     * @param accNumOfLine the accNumOfLine to set
     */
    public void setAccNumOfLine(int accNumOfLine) {
        this.accNumOfLine = accNumOfLine;
    }

   
    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
