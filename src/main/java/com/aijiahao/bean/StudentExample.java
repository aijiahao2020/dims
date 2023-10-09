package com.aijiahao.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
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

        public Criteria andStuPasswordIsNull() {
            addCriterion("stu_password is null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNotNull() {
            addCriterion("stu_password is not null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordEqualTo(String value) {
            addCriterion("stu_password =", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotEqualTo(String value) {
            addCriterion("stu_password <>", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThan(String value) {
            addCriterion("stu_password >", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("stu_password >=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThan(String value) {
            addCriterion("stu_password <", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThanOrEqualTo(String value) {
            addCriterion("stu_password <=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLike(String value) {
            addCriterion("stu_password like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotLike(String value) {
            addCriterion("stu_password not like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIn(List<String> values) {
            addCriterion("stu_password in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotIn(List<String> values) {
            addCriterion("stu_password not in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordBetween(String value1, String value2) {
            addCriterion("stu_password between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotBetween(String value1, String value2) {
            addCriterion("stu_password not between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNull() {
            addCriterion("bed_id is null");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNotNull() {
            addCriterion("bed_id is not null");
            return (Criteria) this;
        }

        public Criteria andBedIdEqualTo(String value) {
            addCriterion("bed_id =", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotEqualTo(String value) {
            addCriterion("bed_id <>", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThan(String value) {
            addCriterion("bed_id >", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThanOrEqualTo(String value) {
            addCriterion("bed_id >=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThan(String value) {
            addCriterion("bed_id <", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThanOrEqualTo(String value) {
            addCriterion("bed_id <=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLike(String value) {
            addCriterion("bed_id like", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotLike(String value) {
            addCriterion("bed_id not like", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdIn(List<String> values) {
            addCriterion("bed_id in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotIn(List<String> values) {
            addCriterion("bed_id not in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdBetween(String value1, String value2) {
            addCriterion("bed_id between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotBetween(String value1, String value2) {
            addCriterion("bed_id not between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuPortraitIsNull() {
            addCriterion("stu_portrait is null");
            return (Criteria) this;
        }

        public Criteria andStuPortraitIsNotNull() {
            addCriterion("stu_portrait is not null");
            return (Criteria) this;
        }

        public Criteria andStuPortraitEqualTo(String value) {
            addCriterion("stu_portrait =", value, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitNotEqualTo(String value) {
            addCriterion("stu_portrait <>", value, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitGreaterThan(String value) {
            addCriterion("stu_portrait >", value, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("stu_portrait >=", value, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitLessThan(String value) {
            addCriterion("stu_portrait <", value, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitLessThanOrEqualTo(String value) {
            addCriterion("stu_portrait <=", value, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitLike(String value) {
            addCriterion("stu_portrait like", value, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitNotLike(String value) {
            addCriterion("stu_portrait not like", value, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitIn(List<String> values) {
            addCriterion("stu_portrait in", values, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitNotIn(List<String> values) {
            addCriterion("stu_portrait not in", values, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitBetween(String value1, String value2) {
            addCriterion("stu_portrait between", value1, value2, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuPortraitNotBetween(String value1, String value2) {
            addCriterion("stu_portrait not between", value1, value2, "stuPortrait");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuAcademyIsNull() {
            addCriterion("stu_academy is null");
            return (Criteria) this;
        }

        public Criteria andStuAcademyIsNotNull() {
            addCriterion("stu_academy is not null");
            return (Criteria) this;
        }

        public Criteria andStuAcademyEqualTo(String value) {
            addCriterion("stu_academy =", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyNotEqualTo(String value) {
            addCriterion("stu_academy <>", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyGreaterThan(String value) {
            addCriterion("stu_academy >", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyGreaterThanOrEqualTo(String value) {
            addCriterion("stu_academy >=", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyLessThan(String value) {
            addCriterion("stu_academy <", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyLessThanOrEqualTo(String value) {
            addCriterion("stu_academy <=", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyLike(String value) {
            addCriterion("stu_academy like", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyNotLike(String value) {
            addCriterion("stu_academy not like", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyIn(List<String> values) {
            addCriterion("stu_academy in", values, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyNotIn(List<String> values) {
            addCriterion("stu_academy not in", values, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyBetween(String value1, String value2) {
            addCriterion("stu_academy between", value1, value2, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyNotBetween(String value1, String value2) {
            addCriterion("stu_academy not between", value1, value2, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNull() {
            addCriterion("stu_class is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNotNull() {
            addCriterion("stu_class is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassEqualTo(String value) {
            addCriterion("stu_class =", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotEqualTo(String value) {
            addCriterion("stu_class <>", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThan(String value) {
            addCriterion("stu_class >", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_class >=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThan(String value) {
            addCriterion("stu_class <", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThanOrEqualTo(String value) {
            addCriterion("stu_class <=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLike(String value) {
            addCriterion("stu_class like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotLike(String value) {
            addCriterion("stu_class not like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassIn(List<String> values) {
            addCriterion("stu_class in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotIn(List<String> values) {
            addCriterion("stu_class not in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassBetween(String value1, String value2) {
            addCriterion("stu_class between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotBetween(String value1, String value2) {
            addCriterion("stu_class not between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuProIsNull() {
            addCriterion("stu_pro is null");
            return (Criteria) this;
        }

        public Criteria andStuProIsNotNull() {
            addCriterion("stu_pro is not null");
            return (Criteria) this;
        }

        public Criteria andStuProEqualTo(String value) {
            addCriterion("stu_pro =", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotEqualTo(String value) {
            addCriterion("stu_pro <>", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProGreaterThan(String value) {
            addCriterion("stu_pro >", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pro >=", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLessThan(String value) {
            addCriterion("stu_pro <", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLessThanOrEqualTo(String value) {
            addCriterion("stu_pro <=", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLike(String value) {
            addCriterion("stu_pro like", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotLike(String value) {
            addCriterion("stu_pro not like", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProIn(List<String> values) {
            addCriterion("stu_pro in", values, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotIn(List<String> values) {
            addCriterion("stu_pro not in", values, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProBetween(String value1, String value2) {
            addCriterion("stu_pro between", value1, value2, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotBetween(String value1, String value2) {
            addCriterion("stu_pro not between", value1, value2, "stuPro");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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