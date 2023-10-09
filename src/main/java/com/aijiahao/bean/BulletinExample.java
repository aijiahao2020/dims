package com.aijiahao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BulletinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BulletinExample() {
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

        public Criteria andBltIdIsNull() {
            addCriterion("blt_id is null");
            return (Criteria) this;
        }

        public Criteria andBltIdIsNotNull() {
            addCriterion("blt_id is not null");
            return (Criteria) this;
        }

        public Criteria andBltIdEqualTo(Integer value) {
            addCriterion("blt_id =", value, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdNotEqualTo(Integer value) {
            addCriterion("blt_id <>", value, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdGreaterThan(Integer value) {
            addCriterion("blt_id >", value, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blt_id >=", value, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdLessThan(Integer value) {
            addCriterion("blt_id <", value, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdLessThanOrEqualTo(Integer value) {
            addCriterion("blt_id <=", value, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdIn(List<Integer> values) {
            addCriterion("blt_id in", values, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdNotIn(List<Integer> values) {
            addCriterion("blt_id not in", values, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdBetween(Integer value1, Integer value2) {
            addCriterion("blt_id between", value1, value2, "bltId");
            return (Criteria) this;
        }

        public Criteria andBltIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blt_id not between", value1, value2, "bltId");
            return (Criteria) this;
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

        public Criteria andBltTitleIsNull() {
            addCriterion("blt_title is null");
            return (Criteria) this;
        }

        public Criteria andBltTitleIsNotNull() {
            addCriterion("blt_title is not null");
            return (Criteria) this;
        }

        public Criteria andBltTitleEqualTo(String value) {
            addCriterion("blt_title =", value, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleNotEqualTo(String value) {
            addCriterion("blt_title <>", value, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleGreaterThan(String value) {
            addCriterion("blt_title >", value, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blt_title >=", value, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleLessThan(String value) {
            addCriterion("blt_title <", value, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleLessThanOrEqualTo(String value) {
            addCriterion("blt_title <=", value, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleLike(String value) {
            addCriterion("blt_title like", value, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleNotLike(String value) {
            addCriterion("blt_title not like", value, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleIn(List<String> values) {
            addCriterion("blt_title in", values, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleNotIn(List<String> values) {
            addCriterion("blt_title not in", values, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleBetween(String value1, String value2) {
            addCriterion("blt_title between", value1, value2, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltTitleNotBetween(String value1, String value2) {
            addCriterion("blt_title not between", value1, value2, "bltTitle");
            return (Criteria) this;
        }

        public Criteria andBltContentIsNull() {
            addCriterion("blt_content is null");
            return (Criteria) this;
        }

        public Criteria andBltContentIsNotNull() {
            addCriterion("blt_content is not null");
            return (Criteria) this;
        }

        public Criteria andBltContentEqualTo(String value) {
            addCriterion("blt_content =", value, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentNotEqualTo(String value) {
            addCriterion("blt_content <>", value, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentGreaterThan(String value) {
            addCriterion("blt_content >", value, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentGreaterThanOrEqualTo(String value) {
            addCriterion("blt_content >=", value, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentLessThan(String value) {
            addCriterion("blt_content <", value, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentLessThanOrEqualTo(String value) {
            addCriterion("blt_content <=", value, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentLike(String value) {
            addCriterion("blt_content like", value, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentNotLike(String value) {
            addCriterion("blt_content not like", value, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentIn(List<String> values) {
            addCriterion("blt_content in", values, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentNotIn(List<String> values) {
            addCriterion("blt_content not in", values, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentBetween(String value1, String value2) {
            addCriterion("blt_content between", value1, value2, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltContentNotBetween(String value1, String value2) {
            addCriterion("blt_content not between", value1, value2, "bltContent");
            return (Criteria) this;
        }

        public Criteria andBltTimeIsNull() {
            addCriterion("blt_time is null");
            return (Criteria) this;
        }

        public Criteria andBltTimeIsNotNull() {
            addCriterion("blt_time is not null");
            return (Criteria) this;
        }

        public Criteria andBltTimeEqualTo(Date value) {
            addCriterion("blt_time =", value, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeNotEqualTo(Date value) {
            addCriterion("blt_time <>", value, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeGreaterThan(Date value) {
            addCriterion("blt_time >", value, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blt_time >=", value, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeLessThan(Date value) {
            addCriterion("blt_time <", value, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeLessThanOrEqualTo(Date value) {
            addCriterion("blt_time <=", value, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeIn(List<Date> values) {
            addCriterion("blt_time in", values, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeNotIn(List<Date> values) {
            addCriterion("blt_time not in", values, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeBetween(Date value1, Date value2) {
            addCriterion("blt_time between", value1, value2, "bltTime");
            return (Criteria) this;
        }

        public Criteria andBltTimeNotBetween(Date value1, Date value2) {
            addCriterion("blt_time not between", value1, value2, "bltTime");
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