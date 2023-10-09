package com.aijiahao.bean;

import java.util.ArrayList;
import java.util.List;

public class SystemAdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemAdministratorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_id like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_id not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAptIdIsNull() {
            addCriterion("apt_id is null");
            return (Criteria) this;
        }

        public Criteria andAptIdIsNotNull() {
            addCriterion("apt_id is not null");
            return (Criteria) this;
        }

        public Criteria andAptIdEqualTo(String value) {
            addCriterion("apt_id =", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdNotEqualTo(String value) {
            addCriterion("apt_id <>", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdGreaterThan(String value) {
            addCriterion("apt_id >", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdGreaterThanOrEqualTo(String value) {
            addCriterion("apt_id >=", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdLessThan(String value) {
            addCriterion("apt_id <", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdLessThanOrEqualTo(String value) {
            addCriterion("apt_id <=", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdLike(String value) {
            addCriterion("apt_id like", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdNotLike(String value) {
            addCriterion("apt_id not like", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdIn(List<String> values) {
            addCriterion("apt_id in", values, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdNotIn(List<String> values) {
            addCriterion("apt_id not in", values, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdBetween(String value1, String value2) {
            addCriterion("apt_id between", value1, value2, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdNotBetween(String value1, String value2) {
            addCriterion("apt_id not between", value1, value2, "aptId");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminImageIsNull() {
            addCriterion("admin_image is null");
            return (Criteria) this;
        }

        public Criteria andAdminImageIsNotNull() {
            addCriterion("admin_image is not null");
            return (Criteria) this;
        }

        public Criteria andAdminImageEqualTo(String value) {
            addCriterion("admin_image =", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageNotEqualTo(String value) {
            addCriterion("admin_image <>", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageGreaterThan(String value) {
            addCriterion("admin_image >", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageGreaterThanOrEqualTo(String value) {
            addCriterion("admin_image >=", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageLessThan(String value) {
            addCriterion("admin_image <", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageLessThanOrEqualTo(String value) {
            addCriterion("admin_image <=", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageLike(String value) {
            addCriterion("admin_image like", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageNotLike(String value) {
            addCriterion("admin_image not like", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageIn(List<String> values) {
            addCriterion("admin_image in", values, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageNotIn(List<String> values) {
            addCriterion("admin_image not in", values, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageBetween(String value1, String value2) {
            addCriterion("admin_image between", value1, value2, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageNotBetween(String value1, String value2) {
            addCriterion("admin_image not between", value1, value2, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNull() {
            addCriterion("admin_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNotNull() {
            addCriterion("admin_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSexEqualTo(String value) {
            addCriterion("admin_sex =", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotEqualTo(String value) {
            addCriterion("admin_sex <>", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThan(String value) {
            addCriterion("admin_sex >", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThanOrEqualTo(String value) {
            addCriterion("admin_sex >=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThan(String value) {
            addCriterion("admin_sex <", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThanOrEqualTo(String value) {
            addCriterion("admin_sex <=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLike(String value) {
            addCriterion("admin_sex like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotLike(String value) {
            addCriterion("admin_sex not like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexIn(List<String> values) {
            addCriterion("admin_sex in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotIn(List<String> values) {
            addCriterion("admin_sex not in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexBetween(String value1, String value2) {
            addCriterion("admin_sex between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotBetween(String value1, String value2) {
            addCriterion("admin_sex not between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNull() {
            addCriterion("admin_type is null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNotNull() {
            addCriterion("admin_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeEqualTo(Integer value) {
            addCriterion("admin_type =", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotEqualTo(Integer value) {
            addCriterion("admin_type <>", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThan(Integer value) {
            addCriterion("admin_type >", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_type >=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThan(Integer value) {
            addCriterion("admin_type <", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThanOrEqualTo(Integer value) {
            addCriterion("admin_type <=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIn(List<Integer> values) {
            addCriterion("admin_type in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotIn(List<Integer> values) {
            addCriterion("admin_type not in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeBetween(Integer value1, Integer value2) {
            addCriterion("admin_type between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_type not between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableIsNull() {
            addCriterion("admin_available is null");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableIsNotNull() {
            addCriterion("admin_available is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableEqualTo(String value) {
            addCriterion("admin_available =", value, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableNotEqualTo(String value) {
            addCriterion("admin_available <>", value, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableGreaterThan(String value) {
            addCriterion("admin_available >", value, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("admin_available >=", value, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableLessThan(String value) {
            addCriterion("admin_available <", value, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableLessThanOrEqualTo(String value) {
            addCriterion("admin_available <=", value, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableLike(String value) {
            addCriterion("admin_available like", value, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableNotLike(String value) {
            addCriterion("admin_available not like", value, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableIn(List<String> values) {
            addCriterion("admin_available in", values, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableNotIn(List<String> values) {
            addCriterion("admin_available not in", values, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableBetween(String value1, String value2) {
            addCriterion("admin_available between", value1, value2, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminAvailableNotBetween(String value1, String value2) {
            addCriterion("admin_available not between", value1, value2, "adminAvailable");
            return (Criteria) this;
        }

        public Criteria andAdminPositionIsNull() {
            addCriterion("admin_position is null");
            return (Criteria) this;
        }

        public Criteria andAdminPositionIsNotNull() {
            addCriterion("admin_position is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPositionEqualTo(String value) {
            addCriterion("admin_position =", value, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionNotEqualTo(String value) {
            addCriterion("admin_position <>", value, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionGreaterThan(String value) {
            addCriterion("admin_position >", value, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionGreaterThanOrEqualTo(String value) {
            addCriterion("admin_position >=", value, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionLessThan(String value) {
            addCriterion("admin_position <", value, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionLessThanOrEqualTo(String value) {
            addCriterion("admin_position <=", value, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionLike(String value) {
            addCriterion("admin_position like", value, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionNotLike(String value) {
            addCriterion("admin_position not like", value, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionIn(List<String> values) {
            addCriterion("admin_position in", values, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionNotIn(List<String> values) {
            addCriterion("admin_position not in", values, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionBetween(String value1, String value2) {
            addCriterion("admin_position between", value1, value2, "adminPosition");
            return (Criteria) this;
        }

        public Criteria andAdminPositionNotBetween(String value1, String value2) {
            addCriterion("admin_position not between", value1, value2, "adminPosition");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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