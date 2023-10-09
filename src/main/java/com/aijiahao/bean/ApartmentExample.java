package com.aijiahao.bean;

import java.util.ArrayList;
import java.util.List;

public class ApartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApartmentExample() {
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

        public Criteria andAptDescribeIsNull() {
            addCriterion("apt_describe is null");
            return (Criteria) this;
        }

        public Criteria andAptDescribeIsNotNull() {
            addCriterion("apt_describe is not null");
            return (Criteria) this;
        }

        public Criteria andAptDescribeEqualTo(String value) {
            addCriterion("apt_describe =", value, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeNotEqualTo(String value) {
            addCriterion("apt_describe <>", value, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeGreaterThan(String value) {
            addCriterion("apt_describe >", value, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("apt_describe >=", value, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeLessThan(String value) {
            addCriterion("apt_describe <", value, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeLessThanOrEqualTo(String value) {
            addCriterion("apt_describe <=", value, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeLike(String value) {
            addCriterion("apt_describe like", value, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeNotLike(String value) {
            addCriterion("apt_describe not like", value, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeIn(List<String> values) {
            addCriterion("apt_describe in", values, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeNotIn(List<String> values) {
            addCriterion("apt_describe not in", values, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeBetween(String value1, String value2) {
            addCriterion("apt_describe between", value1, value2, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptDescribeNotBetween(String value1, String value2) {
            addCriterion("apt_describe not between", value1, value2, "aptDescribe");
            return (Criteria) this;
        }

        public Criteria andAptLayerIsNull() {
            addCriterion("apt_layer is null");
            return (Criteria) this;
        }

        public Criteria andAptLayerIsNotNull() {
            addCriterion("apt_layer is not null");
            return (Criteria) this;
        }

        public Criteria andAptLayerEqualTo(Integer value) {
            addCriterion("apt_layer =", value, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerNotEqualTo(Integer value) {
            addCriterion("apt_layer <>", value, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerGreaterThan(Integer value) {
            addCriterion("apt_layer >", value, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("apt_layer >=", value, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerLessThan(Integer value) {
            addCriterion("apt_layer <", value, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerLessThanOrEqualTo(Integer value) {
            addCriterion("apt_layer <=", value, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerIn(List<Integer> values) {
            addCriterion("apt_layer in", values, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerNotIn(List<Integer> values) {
            addCriterion("apt_layer not in", values, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerBetween(Integer value1, Integer value2) {
            addCriterion("apt_layer between", value1, value2, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("apt_layer not between", value1, value2, "aptLayer");
            return (Criteria) this;
        }

        public Criteria andAptClassIsNull() {
            addCriterion("apt_class is null");
            return (Criteria) this;
        }

        public Criteria andAptClassIsNotNull() {
            addCriterion("apt_class is not null");
            return (Criteria) this;
        }

        public Criteria andAptClassEqualTo(Integer value) {
            addCriterion("apt_class =", value, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassNotEqualTo(Integer value) {
            addCriterion("apt_class <>", value, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassGreaterThan(Integer value) {
            addCriterion("apt_class >", value, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("apt_class >=", value, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassLessThan(Integer value) {
            addCriterion("apt_class <", value, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassLessThanOrEqualTo(Integer value) {
            addCriterion("apt_class <=", value, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassIn(List<Integer> values) {
            addCriterion("apt_class in", values, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassNotIn(List<Integer> values) {
            addCriterion("apt_class not in", values, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassBetween(Integer value1, Integer value2) {
            addCriterion("apt_class between", value1, value2, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptClassNotBetween(Integer value1, Integer value2) {
            addCriterion("apt_class not between", value1, value2, "aptClass");
            return (Criteria) this;
        }

        public Criteria andAptMaxpIsNull() {
            addCriterion("apt_maxp is null");
            return (Criteria) this;
        }

        public Criteria andAptMaxpIsNotNull() {
            addCriterion("apt_maxp is not null");
            return (Criteria) this;
        }

        public Criteria andAptMaxpEqualTo(Integer value) {
            addCriterion("apt_maxp =", value, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpNotEqualTo(Integer value) {
            addCriterion("apt_maxp <>", value, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpGreaterThan(Integer value) {
            addCriterion("apt_maxp >", value, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpGreaterThanOrEqualTo(Integer value) {
            addCriterion("apt_maxp >=", value, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpLessThan(Integer value) {
            addCriterion("apt_maxp <", value, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpLessThanOrEqualTo(Integer value) {
            addCriterion("apt_maxp <=", value, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpIn(List<Integer> values) {
            addCriterion("apt_maxp in", values, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpNotIn(List<Integer> values) {
            addCriterion("apt_maxp not in", values, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpBetween(Integer value1, Integer value2) {
            addCriterion("apt_maxp between", value1, value2, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptMaxpNotBetween(Integer value1, Integer value2) {
            addCriterion("apt_maxp not between", value1, value2, "aptMaxp");
            return (Criteria) this;
        }

        public Criteria andAptRealpIsNull() {
            addCriterion("apt_realp is null");
            return (Criteria) this;
        }

        public Criteria andAptRealpIsNotNull() {
            addCriterion("apt_realp is not null");
            return (Criteria) this;
        }

        public Criteria andAptRealpEqualTo(Integer value) {
            addCriterion("apt_realp =", value, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpNotEqualTo(Integer value) {
            addCriterion("apt_realp <>", value, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpGreaterThan(Integer value) {
            addCriterion("apt_realp >", value, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpGreaterThanOrEqualTo(Integer value) {
            addCriterion("apt_realp >=", value, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpLessThan(Integer value) {
            addCriterion("apt_realp <", value, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpLessThanOrEqualTo(Integer value) {
            addCriterion("apt_realp <=", value, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpIn(List<Integer> values) {
            addCriterion("apt_realp in", values, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpNotIn(List<Integer> values) {
            addCriterion("apt_realp not in", values, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpBetween(Integer value1, Integer value2) {
            addCriterion("apt_realp between", value1, value2, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptRealpNotBetween(Integer value1, Integer value2) {
            addCriterion("apt_realp not between", value1, value2, "aptRealp");
            return (Criteria) this;
        }

        public Criteria andAptSexIsNull() {
            addCriterion("apt_sex is null");
            return (Criteria) this;
        }

        public Criteria andAptSexIsNotNull() {
            addCriterion("apt_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAptSexEqualTo(String value) {
            addCriterion("apt_sex =", value, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexNotEqualTo(String value) {
            addCriterion("apt_sex <>", value, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexGreaterThan(String value) {
            addCriterion("apt_sex >", value, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexGreaterThanOrEqualTo(String value) {
            addCriterion("apt_sex >=", value, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexLessThan(String value) {
            addCriterion("apt_sex <", value, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexLessThanOrEqualTo(String value) {
            addCriterion("apt_sex <=", value, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexLike(String value) {
            addCriterion("apt_sex like", value, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexNotLike(String value) {
            addCriterion("apt_sex not like", value, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexIn(List<String> values) {
            addCriterion("apt_sex in", values, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexNotIn(List<String> values) {
            addCriterion("apt_sex not in", values, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexBetween(String value1, String value2) {
            addCriterion("apt_sex between", value1, value2, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptSexNotBetween(String value1, String value2) {
            addCriterion("apt_sex not between", value1, value2, "aptSex");
            return (Criteria) this;
        }

        public Criteria andAptAddressIsNull() {
            addCriterion("apt_address is null");
            return (Criteria) this;
        }

        public Criteria andAptAddressIsNotNull() {
            addCriterion("apt_address is not null");
            return (Criteria) this;
        }

        public Criteria andAptAddressEqualTo(String value) {
            addCriterion("apt_address =", value, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressNotEqualTo(String value) {
            addCriterion("apt_address <>", value, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressGreaterThan(String value) {
            addCriterion("apt_address >", value, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressGreaterThanOrEqualTo(String value) {
            addCriterion("apt_address >=", value, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressLessThan(String value) {
            addCriterion("apt_address <", value, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressLessThanOrEqualTo(String value) {
            addCriterion("apt_address <=", value, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressLike(String value) {
            addCriterion("apt_address like", value, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressNotLike(String value) {
            addCriterion("apt_address not like", value, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressIn(List<String> values) {
            addCriterion("apt_address in", values, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressNotIn(List<String> values) {
            addCriterion("apt_address not in", values, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressBetween(String value1, String value2) {
            addCriterion("apt_address between", value1, value2, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptAddressNotBetween(String value1, String value2) {
            addCriterion("apt_address not between", value1, value2, "aptAddress");
            return (Criteria) this;
        }

        public Criteria andAptImgIsNull() {
            addCriterion("apt_img is null");
            return (Criteria) this;
        }

        public Criteria andAptImgIsNotNull() {
            addCriterion("apt_img is not null");
            return (Criteria) this;
        }

        public Criteria andAptImgEqualTo(String value) {
            addCriterion("apt_img =", value, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgNotEqualTo(String value) {
            addCriterion("apt_img <>", value, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgGreaterThan(String value) {
            addCriterion("apt_img >", value, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgGreaterThanOrEqualTo(String value) {
            addCriterion("apt_img >=", value, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgLessThan(String value) {
            addCriterion("apt_img <", value, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgLessThanOrEqualTo(String value) {
            addCriterion("apt_img <=", value, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgLike(String value) {
            addCriterion("apt_img like", value, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgNotLike(String value) {
            addCriterion("apt_img not like", value, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgIn(List<String> values) {
            addCriterion("apt_img in", values, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgNotIn(List<String> values) {
            addCriterion("apt_img not in", values, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgBetween(String value1, String value2) {
            addCriterion("apt_img between", value1, value2, "aptImg");
            return (Criteria) this;
        }

        public Criteria andAptImgNotBetween(String value1, String value2) {
            addCriterion("apt_img not between", value1, value2, "aptImg");
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