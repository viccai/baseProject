package com.base.model;

import java.util.ArrayList;
import java.util.List;

public class MMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MMenuExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNull() {
            addCriterion("m_type is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNotNull() {
            addCriterion("m_type is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeEqualTo(String value) {
            addCriterion("m_type =", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotEqualTo(String value) {
            addCriterion("m_type <>", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThan(String value) {
            addCriterion("m_type >", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThanOrEqualTo(String value) {
            addCriterion("m_type >=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThan(String value) {
            addCriterion("m_type <", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThanOrEqualTo(String value) {
            addCriterion("m_type <=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLike(String value) {
            addCriterion("m_type like", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotLike(String value) {
            addCriterion("m_type not like", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeIn(List<String> values) {
            addCriterion("m_type in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotIn(List<String> values) {
            addCriterion("m_type not in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeBetween(String value1, String value2) {
            addCriterion("m_type between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotBetween(String value1, String value2) {
            addCriterion("m_type not between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMUrlIsNull() {
            addCriterion("m_url is null");
            return (Criteria) this;
        }

        public Criteria andMUrlIsNotNull() {
            addCriterion("m_url is not null");
            return (Criteria) this;
        }

        public Criteria andMUrlEqualTo(String value) {
            addCriterion("m_url =", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotEqualTo(String value) {
            addCriterion("m_url <>", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlGreaterThan(String value) {
            addCriterion("m_url >", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlGreaterThanOrEqualTo(String value) {
            addCriterion("m_url >=", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLessThan(String value) {
            addCriterion("m_url <", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLessThanOrEqualTo(String value) {
            addCriterion("m_url <=", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlLike(String value) {
            addCriterion("m_url like", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotLike(String value) {
            addCriterion("m_url not like", value, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlIn(List<String> values) {
            addCriterion("m_url in", values, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotIn(List<String> values) {
            addCriterion("m_url not in", values, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlBetween(String value1, String value2) {
            addCriterion("m_url between", value1, value2, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMUrlNotBetween(String value1, String value2) {
            addCriterion("m_url not between", value1, value2, "mUrl");
            return (Criteria) this;
        }

        public Criteria andMHaveChildIsNull() {
            addCriterion("m_have_child is null");
            return (Criteria) this;
        }

        public Criteria andMHaveChildIsNotNull() {
            addCriterion("m_have_child is not null");
            return (Criteria) this;
        }

        public Criteria andMHaveChildEqualTo(String value) {
            addCriterion("m_have_child =", value, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildNotEqualTo(String value) {
            addCriterion("m_have_child <>", value, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildGreaterThan(String value) {
            addCriterion("m_have_child >", value, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildGreaterThanOrEqualTo(String value) {
            addCriterion("m_have_child >=", value, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildLessThan(String value) {
            addCriterion("m_have_child <", value, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildLessThanOrEqualTo(String value) {
            addCriterion("m_have_child <=", value, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildLike(String value) {
            addCriterion("m_have_child like", value, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildNotLike(String value) {
            addCriterion("m_have_child not like", value, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildIn(List<String> values) {
            addCriterion("m_have_child in", values, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildNotIn(List<String> values) {
            addCriterion("m_have_child not in", values, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildBetween(String value1, String value2) {
            addCriterion("m_have_child between", value1, value2, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMHaveChildNotBetween(String value1, String value2) {
            addCriterion("m_have_child not between", value1, value2, "mHaveChild");
            return (Criteria) this;
        }

        public Criteria andMPidIsNull() {
            addCriterion("m_pid is null");
            return (Criteria) this;
        }

        public Criteria andMPidIsNotNull() {
            addCriterion("m_pid is not null");
            return (Criteria) this;
        }

        public Criteria andMPidEqualTo(String value) {
            addCriterion("m_pid =", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotEqualTo(String value) {
            addCriterion("m_pid <>", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidGreaterThan(String value) {
            addCriterion("m_pid >", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidGreaterThanOrEqualTo(String value) {
            addCriterion("m_pid >=", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidLessThan(String value) {
            addCriterion("m_pid <", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidLessThanOrEqualTo(String value) {
            addCriterion("m_pid <=", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidLike(String value) {
            addCriterion("m_pid like", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotLike(String value) {
            addCriterion("m_pid not like", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidIn(List<String> values) {
            addCriterion("m_pid in", values, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotIn(List<String> values) {
            addCriterion("m_pid not in", values, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidBetween(String value1, String value2) {
            addCriterion("m_pid between", value1, value2, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotBetween(String value1, String value2) {
            addCriterion("m_pid not between", value1, value2, "mPid");
            return (Criteria) this;
        }

        public Criteria andMDatalevelIsNull() {
            addCriterion("m_datalevel is null");
            return (Criteria) this;
        }

        public Criteria andMDatalevelIsNotNull() {
            addCriterion("m_datalevel is not null");
            return (Criteria) this;
        }

        public Criteria andMDatalevelEqualTo(String value) {
            addCriterion("m_datalevel =", value, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelNotEqualTo(String value) {
            addCriterion("m_datalevel <>", value, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelGreaterThan(String value) {
            addCriterion("m_datalevel >", value, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelGreaterThanOrEqualTo(String value) {
            addCriterion("m_datalevel >=", value, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelLessThan(String value) {
            addCriterion("m_datalevel <", value, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelLessThanOrEqualTo(String value) {
            addCriterion("m_datalevel <=", value, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelLike(String value) {
            addCriterion("m_datalevel like", value, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelNotLike(String value) {
            addCriterion("m_datalevel not like", value, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelIn(List<String> values) {
            addCriterion("m_datalevel in", values, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelNotIn(List<String> values) {
            addCriterion("m_datalevel not in", values, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelBetween(String value1, String value2) {
            addCriterion("m_datalevel between", value1, value2, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMDatalevelNotBetween(String value1, String value2) {
            addCriterion("m_datalevel not between", value1, value2, "mDatalevel");
            return (Criteria) this;
        }

        public Criteria andMSnIsNull() {
            addCriterion("m_sn is null");
            return (Criteria) this;
        }

        public Criteria andMSnIsNotNull() {
            addCriterion("m_sn is not null");
            return (Criteria) this;
        }

        public Criteria andMSnEqualTo(Integer value) {
            addCriterion("m_sn =", value, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnNotEqualTo(Integer value) {
            addCriterion("m_sn <>", value, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnGreaterThan(Integer value) {
            addCriterion("m_sn >", value, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_sn >=", value, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnLessThan(Integer value) {
            addCriterion("m_sn <", value, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnLessThanOrEqualTo(Integer value) {
            addCriterion("m_sn <=", value, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnIn(List<Integer> values) {
            addCriterion("m_sn in", values, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnNotIn(List<Integer> values) {
            addCriterion("m_sn not in", values, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnBetween(Integer value1, Integer value2) {
            addCriterion("m_sn between", value1, value2, "mSn");
            return (Criteria) this;
        }

        public Criteria andMSnNotBetween(Integer value1, Integer value2) {
            addCriterion("m_sn not between", value1, value2, "mSn");
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