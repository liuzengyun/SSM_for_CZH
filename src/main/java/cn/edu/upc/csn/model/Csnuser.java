package cn.edu.upc.csn.model;

public class Csnuser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csnuser.id
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csnuser.username
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csnuser.password
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csnuser.phone
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csnuser.address
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csnuser.id
     *
     * @return the value of csnuser.id
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csnuser.id
     *
     * @param id the value for csnuser.id
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csnuser.username
     *
     * @return the value of csnuser.username
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csnuser.username
     *
     * @param username the value for csnuser.username
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csnuser.password
     *
     * @return the value of csnuser.password
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csnuser.password
     *
     * @param password the value for csnuser.password
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csnuser.phone
     *
     * @return the value of csnuser.phone
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csnuser.phone
     *
     * @param phone the value for csnuser.phone
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csnuser.address
     *
     * @return the value of csnuser.address
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csnuser.address
     *
     * @param address the value for csnuser.address
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}