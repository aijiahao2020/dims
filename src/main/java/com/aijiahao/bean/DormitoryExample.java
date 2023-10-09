package com.aijiahao.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DormitoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DormitoryExample() {
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

        public Criteria andDrmyIdIsNull() {
            addCriterion("drmy_id is null");
            return (Criteria) this;
        }

        public Criteria andDrmyIdIsNotNull() {
            addCriterion("drmy_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrmyIdEqualTo(String value) {
            addCriterion("drmy_id =", value, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdNotEqualTo(String value) {
            addCriterion("drmy_id <>", value, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdGreaterThan(String value) {
            addCriterion("drmy_id >", value, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdGreaterThanOrEqualTo(String value) {
            addCriterion("drmy_id >=", value, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdLessThan(String value) {
            addCriterion("drmy_id <", value, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdLessThanOrEqualTo(String value) {
            addCriterion("drmy_id <=", value, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdLike(String value) {
            addCriterion("drmy_id like", value, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdNotLike(String value) {
            addCriterion("drmy_id not like", value, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdIn(List<String> values) {
            addCriterion("drmy_id in", values, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdNotIn(List<String> values) {
            addCriterion("drmy_id not in", values, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdBetween(String value1, String value2) {
            addCriterion("drmy_id between", value1, value2, "drmyId");
            return (Criteria) this;
        }

        public Criteria andDrmyIdNotBetween(String value1, String value2) {
            addCriterion("drmy_id not between", value1, value2, "drmyId");
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

        public Criteria andDrmyNumIsNull() {
            addCriterion("drmy_num is null");
            return (Criteria) this;
        }

        public Criteria andDrmyNumIsNotNull() {
            addCriterion("drmy_num is not null");
            return (Criteria) this;
        }

        public Criteria andDrmyNumEqualTo(Integer value) {
            addCriterion("drmy_num =", value, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumNotEqualTo(Integer value) {
            addCriterion("drmy_num <>", value, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumGreaterThan(Integer value) {
            addCriterion("drmy_num >", value, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("drmy_num >=", value, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumLessThan(Integer value) {
            addCriterion("drmy_num <", value, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumLessThanOrEqualTo(Integer value) {
            addCriterion("drmy_num <=", value, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumIn(List<Integer> values) {
            addCriterion("drmy_num in", values, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumNotIn(List<Integer> values) {
            addCriterion("drmy_num not in", values, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumBetween(Integer value1, Integer value2) {
            addCriterion("drmy_num between", value1, value2, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("drmy_num not between", value1, value2, "drmyNum");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillIsNull() {
            addCriterion("drmy_elebill is null");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillIsNotNull() {
            addCriterion("drmy_elebill is not null");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillEqualTo(BigDecimal value) {
            addCriterion("drmy_elebill =", value, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillNotEqualTo(BigDecimal value) {
            addCriterion("drmy_elebill <>", value, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillGreaterThan(BigDecimal value) {
            addCriterion("drmy_elebill >", value, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drmy_elebill >=", value, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillLessThan(BigDecimal value) {
            addCriterion("drmy_elebill <", value, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drmy_elebill <=", value, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillIn(List<BigDecimal> values) {
            addCriterion("drmy_elebill in", values, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillNotIn(List<BigDecimal> values) {
            addCriterion("drmy_elebill not in", values, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drmy_elebill between", value1, value2, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElebillNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drmy_elebill not between", value1, value2, "drmyElebill");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumIsNull() {
            addCriterion("drmy_elenum is null");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumIsNotNull() {
            addCriterion("drmy_elenum is not null");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumEqualTo(BigDecimal value) {
            addCriterion("drmy_elenum =", value, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumNotEqualTo(BigDecimal value) {
            addCriterion("drmy_elenum <>", value, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumGreaterThan(BigDecimal value) {
            addCriterion("drmy_elenum >", value, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drmy_elenum >=", value, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumLessThan(BigDecimal value) {
            addCriterion("drmy_elenum <", value, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drmy_elenum <=", value, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumIn(List<BigDecimal> values) {
            addCriterion("drmy_elenum in", values, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumNotIn(List<BigDecimal> values) {
            addCriterion("drmy_elenum not in", values, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drmy_elenum between", value1, value2, "drmyElenum");
            return (Criteria) this;
        }

        public Criteria andDrmyElenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drmy_elenum not between", value1, value2, "drmyElenum");
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