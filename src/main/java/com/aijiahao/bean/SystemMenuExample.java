package com.aijiahao.bean;

import java.util.ArrayList;
import java.util.List;

public class SystemMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemMenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNidIsNull() {
            addCriterion("menu_nid is null");
            return (Criteria) this;
        }

        public Criteria andMenuNidIsNotNull() {
            addCriterion("menu_nid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNidEqualTo(Integer value) {
            addCriterion("menu_nid =", value, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidNotEqualTo(Integer value) {
            addCriterion("menu_nid <>", value, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidGreaterThan(Integer value) {
            addCriterion("menu_nid >", value, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_nid >=", value, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidLessThan(Integer value) {
            addCriterion("menu_nid <", value, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidLessThanOrEqualTo(Integer value) {
            addCriterion("menu_nid <=", value, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidIn(List<Integer> values) {
            addCriterion("menu_nid in", values, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidNotIn(List<Integer> values) {
            addCriterion("menu_nid not in", values, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidBetween(Integer value1, Integer value2) {
            addCriterion("menu_nid between", value1, value2, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuNidNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_nid not between", value1, value2, "menuNid");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIsNull() {
            addCriterion("menu_title is null");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIsNotNull() {
            addCriterion("menu_title is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTitleEqualTo(String value) {
            addCriterion("menu_title =", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotEqualTo(String value) {
            addCriterion("menu_title <>", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleGreaterThan(String value) {
            addCriterion("menu_title >", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("menu_title >=", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleLessThan(String value) {
            addCriterion("menu_title <", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleLessThanOrEqualTo(String value) {
            addCriterion("menu_title <=", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleLike(String value) {
            addCriterion("menu_title like", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotLike(String value) {
            addCriterion("menu_title not like", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIn(List<String> values) {
            addCriterion("menu_title in", values, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotIn(List<String> values) {
            addCriterion("menu_title not in", values, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleBetween(String value1, String value2) {
            addCriterion("menu_title between", value1, value2, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotBetween(String value1, String value2) {
            addCriterion("menu_title not between", value1, value2, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuPathIsNull() {
            addCriterion("menu_path is null");
            return (Criteria) this;
        }

        public Criteria andMenuPathIsNotNull() {
            addCriterion("menu_path is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPathEqualTo(String value) {
            addCriterion("menu_path =", value, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathNotEqualTo(String value) {
            addCriterion("menu_path <>", value, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathGreaterThan(String value) {
            addCriterion("menu_path >", value, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathGreaterThanOrEqualTo(String value) {
            addCriterion("menu_path >=", value, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathLessThan(String value) {
            addCriterion("menu_path <", value, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathLessThanOrEqualTo(String value) {
            addCriterion("menu_path <=", value, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathLike(String value) {
            addCriterion("menu_path like", value, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathNotLike(String value) {
            addCriterion("menu_path not like", value, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathIn(List<String> values) {
            addCriterion("menu_path in", values, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathNotIn(List<String> values) {
            addCriterion("menu_path not in", values, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathBetween(String value1, String value2) {
            addCriterion("menu_path between", value1, value2, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuPathNotBetween(String value1, String value2) {
            addCriterion("menu_path not between", value1, value2, "menuPath");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNull() {
            addCriterion("menu_icon is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNotNull() {
            addCriterion("menu_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("menu_icon =", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("menu_icon <>", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("menu_icon >", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("menu_icon >=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThan(String value) {
            addCriterion("menu_icon <", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("menu_icon <=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLike(String value) {
            addCriterion("menu_icon like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotLike(String value) {
            addCriterion("menu_icon not like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("menu_icon in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("menu_icon not in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("menu_icon between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("menu_icon not between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableIsNull() {
            addCriterion("menu_available is null");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableIsNotNull() {
            addCriterion("menu_available is not null");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableEqualTo(String value) {
            addCriterion("menu_available =", value, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableNotEqualTo(String value) {
            addCriterion("menu_available <>", value, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableGreaterThan(String value) {
            addCriterion("menu_available >", value, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("menu_available >=", value, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableLessThan(String value) {
            addCriterion("menu_available <", value, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableLessThanOrEqualTo(String value) {
            addCriterion("menu_available <=", value, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableLike(String value) {
            addCriterion("menu_available like", value, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableNotLike(String value) {
            addCriterion("menu_available not like", value, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableIn(List<String> values) {
            addCriterion("menu_available in", values, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableNotIn(List<String> values) {
            addCriterion("menu_available not in", values, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableBetween(String value1, String value2) {
            addCriterion("menu_available between", value1, value2, "menuAvailable");
            return (Criteria) this;
        }

        public Criteria andMenuAvailableNotBetween(String value1, String value2) {
            addCriterion("menu_available not between", value1, value2, "menuAvailable");
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