package com.sp.Admin.pojo;

import java.util.ArrayList;
import java.util.List;

public class ec_usersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public ec_usersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIsNull() {
            addCriterion("user_regtime is null");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIsNotNull() {
            addCriterion("user_regtime is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeEqualTo(String value) {
            addCriterion("user_regtime =", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotEqualTo(String value) {
            addCriterion("user_regtime <>", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeGreaterThan(String value) {
            addCriterion("user_regtime >", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_regtime >=", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeLessThan(String value) {
            addCriterion("user_regtime <", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeLessThanOrEqualTo(String value) {
            addCriterion("user_regtime <=", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeLike(String value) {
            addCriterion("user_regtime like", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotLike(String value) {
            addCriterion("user_regtime not like", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIn(List<String> values) {
            addCriterion("user_regtime in", values, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotIn(List<String> values) {
            addCriterion("user_regtime not in", values, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeBetween(String value1, String value2) {
            addCriterion("user_regtime between", value1, value2, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotBetween(String value1, String value2) {
            addCriterion("user_regtime not between", value1, value2, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegipIsNull() {
            addCriterion("user_regip is null");
            return (Criteria) this;
        }

        public Criteria andUserRegipIsNotNull() {
            addCriterion("user_regip is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegipEqualTo(String value) {
            addCriterion("user_regip =", value, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipNotEqualTo(String value) {
            addCriterion("user_regip <>", value, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipGreaterThan(String value) {
            addCriterion("user_regip >", value, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipGreaterThanOrEqualTo(String value) {
            addCriterion("user_regip >=", value, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipLessThan(String value) {
            addCriterion("user_regip <", value, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipLessThanOrEqualTo(String value) {
            addCriterion("user_regip <=", value, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipLike(String value) {
            addCriterion("user_regip like", value, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipNotLike(String value) {
            addCriterion("user_regip not like", value, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipIn(List<String> values) {
            addCriterion("user_regip in", values, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipNotIn(List<String> values) {
            addCriterion("user_regip not in", values, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipBetween(String value1, String value2) {
            addCriterion("user_regip between", value1, value2, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserRegipNotBetween(String value1, String value2) {
            addCriterion("user_regip not between", value1, value2, "userRegip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipIsNull() {
            addCriterion("user_ltlogip is null");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipIsNotNull() {
            addCriterion("user_ltlogip is not null");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipEqualTo(String value) {
            addCriterion("user_ltlogip =", value, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipNotEqualTo(String value) {
            addCriterion("user_ltlogip <>", value, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipGreaterThan(String value) {
            addCriterion("user_ltlogip >", value, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipGreaterThanOrEqualTo(String value) {
            addCriterion("user_ltlogip >=", value, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipLessThan(String value) {
            addCriterion("user_ltlogip <", value, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipLessThanOrEqualTo(String value) {
            addCriterion("user_ltlogip <=", value, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipLike(String value) {
            addCriterion("user_ltlogip like", value, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipNotLike(String value) {
            addCriterion("user_ltlogip not like", value, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipIn(List<String> values) {
            addCriterion("user_ltlogip in", values, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipNotIn(List<String> values) {
            addCriterion("user_ltlogip not in", values, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipBetween(String value1, String value2) {
            addCriterion("user_ltlogip between", value1, value2, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserLtlogipNotBetween(String value1, String value2) {
            addCriterion("user_ltlogip not between", value1, value2, "userLtlogip");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNull() {
            addCriterion("user_token is null");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNotNull() {
            addCriterion("user_token is not null");
            return (Criteria) this;
        }

        public Criteria andUserTokenEqualTo(String value) {
            addCriterion("user_token =", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotEqualTo(String value) {
            addCriterion("user_token <>", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThan(String value) {
            addCriterion("user_token >", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThanOrEqualTo(String value) {
            addCriterion("user_token >=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThan(String value) {
            addCriterion("user_token <", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThanOrEqualTo(String value) {
            addCriterion("user_token <=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLike(String value) {
            addCriterion("user_token like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotLike(String value) {
            addCriterion("user_token not like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenIn(List<String> values) {
            addCriterion("user_token in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotIn(List<String> values) {
            addCriterion("user_token not in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenBetween(String value1, String value2) {
            addCriterion("user_token between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotBetween(String value1, String value2) {
            addCriterion("user_token not between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriIsNull() {
            addCriterion("user_portraituri is null");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriIsNotNull() {
            addCriterion("user_portraituri is not null");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriEqualTo(String value) {
            addCriterion("user_portraituri =", value, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriNotEqualTo(String value) {
            addCriterion("user_portraituri <>", value, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriGreaterThan(String value) {
            addCriterion("user_portraituri >", value, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriGreaterThanOrEqualTo(String value) {
            addCriterion("user_portraituri >=", value, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriLessThan(String value) {
            addCriterion("user_portraituri <", value, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriLessThanOrEqualTo(String value) {
            addCriterion("user_portraituri <=", value, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriLike(String value) {
            addCriterion("user_portraituri like", value, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriNotLike(String value) {
            addCriterion("user_portraituri not like", value, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriIn(List<String> values) {
            addCriterion("user_portraituri in", values, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriNotIn(List<String> values) {
            addCriterion("user_portraituri not in", values, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriBetween(String value1, String value2) {
            addCriterion("user_portraituri between", value1, value2, "userPortraituri");
            return (Criteria) this;
        }

        public Criteria andUserPortraituriNotBetween(String value1, String value2) {
            addCriterion("user_portraituri not between", value1, value2, "userPortraituri");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ec_users
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}