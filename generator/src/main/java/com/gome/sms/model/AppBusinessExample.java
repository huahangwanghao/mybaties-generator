package com.gome.sms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppBusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppBusinessExample() {
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

        public Criteria andCustomerApplyCodeIsNull() {
            addCriterion("CUSTOMER_APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeIsNotNull() {
            addCriterion("CUSTOMER_APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeEqualTo(String value) {
            addCriterion("CUSTOMER_APPLY_CODE =", value, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeNotEqualTo(String value) {
            addCriterion("CUSTOMER_APPLY_CODE <>", value, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeGreaterThan(String value) {
            addCriterion("CUSTOMER_APPLY_CODE >", value, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_APPLY_CODE >=", value, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeLessThan(String value) {
            addCriterion("CUSTOMER_APPLY_CODE <", value, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_APPLY_CODE <=", value, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeLike(String value) {
            addCriterion("CUSTOMER_APPLY_CODE like", value, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeNotLike(String value) {
            addCriterion("CUSTOMER_APPLY_CODE not like", value, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeIn(List<String> values) {
            addCriterion("CUSTOMER_APPLY_CODE in", values, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeNotIn(List<String> values) {
            addCriterion("CUSTOMER_APPLY_CODE not in", values, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_APPLY_CODE between", value1, value2, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andCustomerApplyCodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_APPLY_CODE not between", value1, value2, "customerApplyCode");
            return (Criteria) this;
        }

        public Criteria andSernoIsNull() {
            addCriterion("SERNO is null");
            return (Criteria) this;
        }

        public Criteria andSernoIsNotNull() {
            addCriterion("SERNO is not null");
            return (Criteria) this;
        }

        public Criteria andSernoEqualTo(String value) {
            addCriterion("SERNO =", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotEqualTo(String value) {
            addCriterion("SERNO <>", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoGreaterThan(String value) {
            addCriterion("SERNO >", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoGreaterThanOrEqualTo(String value) {
            addCriterion("SERNO >=", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLessThan(String value) {
            addCriterion("SERNO <", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLessThanOrEqualTo(String value) {
            addCriterion("SERNO <=", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLike(String value) {
            addCriterion("SERNO like", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotLike(String value) {
            addCriterion("SERNO not like", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoIn(List<String> values) {
            addCriterion("SERNO in", values, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotIn(List<String> values) {
            addCriterion("SERNO not in", values, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoBetween(String value1, String value2) {
            addCriterion("SERNO between", value1, value2, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotBetween(String value1, String value2) {
            addCriterion("SERNO not between", value1, value2, "serno");
            return (Criteria) this;
        }

        public Criteria andPersonNoIsNull() {
            addCriterion("PERSON_NO is null");
            return (Criteria) this;
        }

        public Criteria andPersonNoIsNotNull() {
            addCriterion("PERSON_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNoEqualTo(String value) {
            addCriterion("PERSON_NO =", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoNotEqualTo(String value) {
            addCriterion("PERSON_NO <>", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoGreaterThan(String value) {
            addCriterion("PERSON_NO >", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_NO >=", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoLessThan(String value) {
            addCriterion("PERSON_NO <", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoLessThanOrEqualTo(String value) {
            addCriterion("PERSON_NO <=", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoLike(String value) {
            addCriterion("PERSON_NO like", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoNotLike(String value) {
            addCriterion("PERSON_NO not like", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoIn(List<String> values) {
            addCriterion("PERSON_NO in", values, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoNotIn(List<String> values) {
            addCriterion("PERSON_NO not in", values, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoBetween(String value1, String value2) {
            addCriterion("PERSON_NO between", value1, value2, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoNotBetween(String value1, String value2) {
            addCriterion("PERSON_NO not between", value1, value2, "personNo");
            return (Criteria) this;
        }

        public Criteria andOptNameIsNull() {
            addCriterion("OPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOptNameIsNotNull() {
            addCriterion("OPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOptNameEqualTo(String value) {
            addCriterion("OPT_NAME =", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotEqualTo(String value) {
            addCriterion("OPT_NAME <>", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameGreaterThan(String value) {
            addCriterion("OPT_NAME >", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_NAME >=", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLessThan(String value) {
            addCriterion("OPT_NAME <", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLessThanOrEqualTo(String value) {
            addCriterion("OPT_NAME <=", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLike(String value) {
            addCriterion("OPT_NAME like", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotLike(String value) {
            addCriterion("OPT_NAME not like", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameIn(List<String> values) {
            addCriterion("OPT_NAME in", values, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotIn(List<String> values) {
            addCriterion("OPT_NAME not in", values, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameBetween(String value1, String value2) {
            addCriterion("OPT_NAME between", value1, value2, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotBetween(String value1, String value2) {
            addCriterion("OPT_NAME not between", value1, value2, "optName");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("USER_CODE =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("USER_CODE <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("USER_CODE >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("USER_CODE <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("USER_CODE like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("USER_CODE not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("USER_CODE in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("USER_CODE not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("USER_CODE between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CODE not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("RISK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("RISK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(String value) {
            addCriterion("RISK_LEVEL =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(String value) {
            addCriterion("RISK_LEVEL <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(String value) {
            addCriterion("RISK_LEVEL >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_LEVEL >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(String value) {
            addCriterion("RISK_LEVEL <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(String value) {
            addCriterion("RISK_LEVEL <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLike(String value) {
            addCriterion("RISK_LEVEL like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotLike(String value) {
            addCriterion("RISK_LEVEL not like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<String> values) {
            addCriterion("RISK_LEVEL in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<String> values) {
            addCriterion("RISK_LEVEL not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(String value1, String value2) {
            addCriterion("RISK_LEVEL between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(String value1, String value2) {
            addCriterion("RISK_LEVEL not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andSesameLeveIsNull() {
            addCriterion("SESAME_LEVE is null");
            return (Criteria) this;
        }

        public Criteria andSesameLeveIsNotNull() {
            addCriterion("SESAME_LEVE is not null");
            return (Criteria) this;
        }

        public Criteria andSesameLeveEqualTo(String value) {
            addCriterion("SESAME_LEVE =", value, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveNotEqualTo(String value) {
            addCriterion("SESAME_LEVE <>", value, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveGreaterThan(String value) {
            addCriterion("SESAME_LEVE >", value, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveGreaterThanOrEqualTo(String value) {
            addCriterion("SESAME_LEVE >=", value, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveLessThan(String value) {
            addCriterion("SESAME_LEVE <", value, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveLessThanOrEqualTo(String value) {
            addCriterion("SESAME_LEVE <=", value, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveLike(String value) {
            addCriterion("SESAME_LEVE like", value, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveNotLike(String value) {
            addCriterion("SESAME_LEVE not like", value, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveIn(List<String> values) {
            addCriterion("SESAME_LEVE in", values, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveNotIn(List<String> values) {
            addCriterion("SESAME_LEVE not in", values, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveBetween(String value1, String value2) {
            addCriterion("SESAME_LEVE between", value1, value2, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLeveNotBetween(String value1, String value2) {
            addCriterion("SESAME_LEVE not between", value1, value2, "sesameLeve");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgIsNull() {
            addCriterion("SESAME_LEVEL_IMG is null");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgIsNotNull() {
            addCriterion("SESAME_LEVEL_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgEqualTo(String value) {
            addCriterion("SESAME_LEVEL_IMG =", value, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgNotEqualTo(String value) {
            addCriterion("SESAME_LEVEL_IMG <>", value, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgGreaterThan(String value) {
            addCriterion("SESAME_LEVEL_IMG >", value, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgGreaterThanOrEqualTo(String value) {
            addCriterion("SESAME_LEVEL_IMG >=", value, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgLessThan(String value) {
            addCriterion("SESAME_LEVEL_IMG <", value, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgLessThanOrEqualTo(String value) {
            addCriterion("SESAME_LEVEL_IMG <=", value, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgLike(String value) {
            addCriterion("SESAME_LEVEL_IMG like", value, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgNotLike(String value) {
            addCriterion("SESAME_LEVEL_IMG not like", value, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgIn(List<String> values) {
            addCriterion("SESAME_LEVEL_IMG in", values, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgNotIn(List<String> values) {
            addCriterion("SESAME_LEVEL_IMG not in", values, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgBetween(String value1, String value2) {
            addCriterion("SESAME_LEVEL_IMG between", value1, value2, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andSesameLevelImgNotBetween(String value1, String value2) {
            addCriterion("SESAME_LEVEL_IMG not between", value1, value2, "sesameLevelImg");
            return (Criteria) this;
        }

        public Criteria andGpsAddressIsNull() {
            addCriterion("GPS_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andGpsAddressIsNotNull() {
            addCriterion("GPS_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andGpsAddressEqualTo(String value) {
            addCriterion("GPS_ADDRESS =", value, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressNotEqualTo(String value) {
            addCriterion("GPS_ADDRESS <>", value, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressGreaterThan(String value) {
            addCriterion("GPS_ADDRESS >", value, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("GPS_ADDRESS >=", value, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressLessThan(String value) {
            addCriterion("GPS_ADDRESS <", value, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressLessThanOrEqualTo(String value) {
            addCriterion("GPS_ADDRESS <=", value, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressLike(String value) {
            addCriterion("GPS_ADDRESS like", value, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressNotLike(String value) {
            addCriterion("GPS_ADDRESS not like", value, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressIn(List<String> values) {
            addCriterion("GPS_ADDRESS in", values, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressNotIn(List<String> values) {
            addCriterion("GPS_ADDRESS not in", values, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressBetween(String value1, String value2) {
            addCriterion("GPS_ADDRESS between", value1, value2, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsAddressNotBetween(String value1, String value2) {
            addCriterion("GPS_ADDRESS not between", value1, value2, "gpsAddress");
            return (Criteria) this;
        }

        public Criteria andGpsCityIsNull() {
            addCriterion("GPS_CITY is null");
            return (Criteria) this;
        }

        public Criteria andGpsCityIsNotNull() {
            addCriterion("GPS_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andGpsCityEqualTo(String value) {
            addCriterion("GPS_CITY =", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityNotEqualTo(String value) {
            addCriterion("GPS_CITY <>", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityGreaterThan(String value) {
            addCriterion("GPS_CITY >", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityGreaterThanOrEqualTo(String value) {
            addCriterion("GPS_CITY >=", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityLessThan(String value) {
            addCriterion("GPS_CITY <", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityLessThanOrEqualTo(String value) {
            addCriterion("GPS_CITY <=", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityLike(String value) {
            addCriterion("GPS_CITY like", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityNotLike(String value) {
            addCriterion("GPS_CITY not like", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityIn(List<String> values) {
            addCriterion("GPS_CITY in", values, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityNotIn(List<String> values) {
            addCriterion("GPS_CITY not in", values, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityBetween(String value1, String value2) {
            addCriterion("GPS_CITY between", value1, value2, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityNotBetween(String value1, String value2) {
            addCriterion("GPS_CITY not between", value1, value2, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andMacAddressIsNull() {
            addCriterion("MAC_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMacAddressIsNotNull() {
            addCriterion("MAC_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMacAddressEqualTo(String value) {
            addCriterion("MAC_ADDRESS =", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotEqualTo(String value) {
            addCriterion("MAC_ADDRESS <>", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressGreaterThan(String value) {
            addCriterion("MAC_ADDRESS >", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressGreaterThanOrEqualTo(String value) {
            addCriterion("MAC_ADDRESS >=", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLessThan(String value) {
            addCriterion("MAC_ADDRESS <", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLessThanOrEqualTo(String value) {
            addCriterion("MAC_ADDRESS <=", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLike(String value) {
            addCriterion("MAC_ADDRESS like", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotLike(String value) {
            addCriterion("MAC_ADDRESS not like", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressIn(List<String> values) {
            addCriterion("MAC_ADDRESS in", values, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotIn(List<String> values) {
            addCriterion("MAC_ADDRESS not in", values, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressBetween(String value1, String value2) {
            addCriterion("MAC_ADDRESS between", value1, value2, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotBetween(String value1, String value2) {
            addCriterion("MAC_ADDRESS not between", value1, value2, "macAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressIsNull() {
            addCriterion("DEVICE_IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressIsNotNull() {
            addCriterion("DEVICE_IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressEqualTo(String value) {
            addCriterion("DEVICE_IP_ADDRESS =", value, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressNotEqualTo(String value) {
            addCriterion("DEVICE_IP_ADDRESS <>", value, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressGreaterThan(String value) {
            addCriterion("DEVICE_IP_ADDRESS >", value, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP_ADDRESS >=", value, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressLessThan(String value) {
            addCriterion("DEVICE_IP_ADDRESS <", value, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP_ADDRESS <=", value, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressLike(String value) {
            addCriterion("DEVICE_IP_ADDRESS like", value, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressNotLike(String value) {
            addCriterion("DEVICE_IP_ADDRESS not like", value, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressIn(List<String> values) {
            addCriterion("DEVICE_IP_ADDRESS in", values, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressNotIn(List<String> values) {
            addCriterion("DEVICE_IP_ADDRESS not in", values, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressBetween(String value1, String value2) {
            addCriterion("DEVICE_IP_ADDRESS between", value1, value2, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceIpAddressNotBetween(String value1, String value2) {
            addCriterion("DEVICE_IP_ADDRESS not between", value1, value2, "deviceIpAddress");
            return (Criteria) this;
        }

        public Criteria andSaleNoIsNull() {
            addCriterion("SALE_NO is null");
            return (Criteria) this;
        }

        public Criteria andSaleNoIsNotNull() {
            addCriterion("SALE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNoEqualTo(String value) {
            addCriterion("SALE_NO =", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotEqualTo(String value) {
            addCriterion("SALE_NO <>", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoGreaterThan(String value) {
            addCriterion("SALE_NO >", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_NO >=", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLessThan(String value) {
            addCriterion("SALE_NO <", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLessThanOrEqualTo(String value) {
            addCriterion("SALE_NO <=", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLike(String value) {
            addCriterion("SALE_NO like", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotLike(String value) {
            addCriterion("SALE_NO not like", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoIn(List<String> values) {
            addCriterion("SALE_NO in", values, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotIn(List<String> values) {
            addCriterion("SALE_NO not in", values, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoBetween(String value1, String value2) {
            addCriterion("SALE_NO between", value1, value2, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotBetween(String value1, String value2) {
            addCriterion("SALE_NO not between", value1, value2, "saleNo");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNull() {
            addCriterion("STORE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNotNull() {
            addCriterion("STORE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeEqualTo(String value) {
            addCriterion("STORE_CODE =", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotEqualTo(String value) {
            addCriterion("STORE_CODE <>", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThan(String value) {
            addCriterion("STORE_CODE >", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_CODE >=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThan(String value) {
            addCriterion("STORE_CODE <", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThanOrEqualTo(String value) {
            addCriterion("STORE_CODE <=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLike(String value) {
            addCriterion("STORE_CODE like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotLike(String value) {
            addCriterion("STORE_CODE not like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIn(List<String> values) {
            addCriterion("STORE_CODE in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotIn(List<String> values) {
            addCriterion("STORE_CODE not in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeBetween(String value1, String value2) {
            addCriterion("STORE_CODE between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotBetween(String value1, String value2) {
            addCriterion("STORE_CODE not between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNull() {
            addCriterion("CRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNotNull() {
            addCriterion("CRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDateEqualTo(Date value) {
            addCriterion("CRT_DATE =", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotEqualTo(Date value) {
            addCriterion("CRT_DATE <>", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThan(Date value) {
            addCriterion("CRT_DATE >", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE >=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThan(Date value) {
            addCriterion("CRT_DATE <", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE <=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateIn(List<Date> values) {
            addCriterion("CRT_DATE in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotIn(List<Date> values) {
            addCriterion("CRT_DATE not in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE not between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateIsNull() {
            addCriterion("MDF_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMdfDateIsNotNull() {
            addCriterion("MDF_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMdfDateEqualTo(Date value) {
            addCriterion("MDF_DATE =", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateNotEqualTo(Date value) {
            addCriterion("MDF_DATE <>", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateGreaterThan(Date value) {
            addCriterion("MDF_DATE >", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MDF_DATE >=", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateLessThan(Date value) {
            addCriterion("MDF_DATE <", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateLessThanOrEqualTo(Date value) {
            addCriterion("MDF_DATE <=", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateIn(List<Date> values) {
            addCriterion("MDF_DATE in", values, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateNotIn(List<Date> values) {
            addCriterion("MDF_DATE not in", values, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateBetween(Date value1, Date value2) {
            addCriterion("MDF_DATE between", value1, value2, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateNotBetween(Date value1, Date value2) {
            addCriterion("MDF_DATE not between", value1, value2, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNull() {
            addCriterion("CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNotNull() {
            addCriterion("CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserEqualTo(String value) {
            addCriterion("CRT_USER =", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotEqualTo(String value) {
            addCriterion("CRT_USER <>", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThan(String value) {
            addCriterion("CRT_USER >", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USER >=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThan(String value) {
            addCriterion("CRT_USER <", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThanOrEqualTo(String value) {
            addCriterion("CRT_USER <=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLike(String value) {
            addCriterion("CRT_USER like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotLike(String value) {
            addCriterion("CRT_USER not like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserIn(List<String> values) {
            addCriterion("CRT_USER in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotIn(List<String> values) {
            addCriterion("CRT_USER not in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserBetween(String value1, String value2) {
            addCriterion("CRT_USER between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotBetween(String value1, String value2) {
            addCriterion("CRT_USER not between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserIsNull() {
            addCriterion("MDF_USER is null");
            return (Criteria) this;
        }

        public Criteria andMdfUserIsNotNull() {
            addCriterion("MDF_USER is not null");
            return (Criteria) this;
        }

        public Criteria andMdfUserEqualTo(String value) {
            addCriterion("MDF_USER =", value, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserNotEqualTo(String value) {
            addCriterion("MDF_USER <>", value, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserGreaterThan(String value) {
            addCriterion("MDF_USER >", value, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserGreaterThanOrEqualTo(String value) {
            addCriterion("MDF_USER >=", value, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserLessThan(String value) {
            addCriterion("MDF_USER <", value, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserLessThanOrEqualTo(String value) {
            addCriterion("MDF_USER <=", value, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserLike(String value) {
            addCriterion("MDF_USER like", value, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserNotLike(String value) {
            addCriterion("MDF_USER not like", value, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserIn(List<String> values) {
            addCriterion("MDF_USER in", values, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserNotIn(List<String> values) {
            addCriterion("MDF_USER not in", values, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserBetween(String value1, String value2) {
            addCriterion("MDF_USER between", value1, value2, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andMdfUserNotBetween(String value1, String value2) {
            addCriterion("MDF_USER not between", value1, value2, "mdfUser");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNull() {
            addCriterion("DATA_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNotNull() {
            addCriterion("DATA_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDataFlagEqualTo(String value) {
            addCriterion("DATA_FLAG =", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotEqualTo(String value) {
            addCriterion("DATA_FLAG <>", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThan(String value) {
            addCriterion("DATA_FLAG >", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_FLAG >=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThan(String value) {
            addCriterion("DATA_FLAG <", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThanOrEqualTo(String value) {
            addCriterion("DATA_FLAG <=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLike(String value) {
            addCriterion("DATA_FLAG like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotLike(String value) {
            addCriterion("DATA_FLAG not like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagIn(List<String> values) {
            addCriterion("DATA_FLAG in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotIn(List<String> values) {
            addCriterion("DATA_FLAG not in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagBetween(String value1, String value2) {
            addCriterion("DATA_FLAG between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotBetween(String value1, String value2) {
            addCriterion("DATA_FLAG not between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoIsNull() {
            addCriterion("IS_ADD_INFO is null");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoIsNotNull() {
            addCriterion("IS_ADD_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoEqualTo(String value) {
            addCriterion("IS_ADD_INFO =", value, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoNotEqualTo(String value) {
            addCriterion("IS_ADD_INFO <>", value, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoGreaterThan(String value) {
            addCriterion("IS_ADD_INFO >", value, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ADD_INFO >=", value, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoLessThan(String value) {
            addCriterion("IS_ADD_INFO <", value, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoLessThanOrEqualTo(String value) {
            addCriterion("IS_ADD_INFO <=", value, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoLike(String value) {
            addCriterion("IS_ADD_INFO like", value, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoNotLike(String value) {
            addCriterion("IS_ADD_INFO not like", value, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoIn(List<String> values) {
            addCriterion("IS_ADD_INFO in", values, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoNotIn(List<String> values) {
            addCriterion("IS_ADD_INFO not in", values, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoBetween(String value1, String value2) {
            addCriterion("IS_ADD_INFO between", value1, value2, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andIsAddInfoNotBetween(String value1, String value2) {
            addCriterion("IS_ADD_INFO not between", value1, value2, "isAddInfo");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("USR_NAME =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("USR_NAME <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("USR_NAME >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("USR_NAME <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("USR_NAME like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("USR_NAME not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("USR_NAME in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("USR_NAME not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("USR_NAME between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("USR_NAME not between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNull() {
            addCriterion("MOBILE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("MOBILE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("MOBILE_NUMBER =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("MOBILE_NUMBER <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("MOBILE_NUMBER >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_NUMBER >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("MOBILE_NUMBER <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_NUMBER <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("MOBILE_NUMBER like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("MOBILE_NUMBER not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("MOBILE_NUMBER in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("MOBILE_NUMBER not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("MOBILE_NUMBER between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("MOBILE_NUMBER not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("TERM is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("TERM is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("TERM =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("TERM <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("TERM >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("TERM >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("TERM <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("TERM <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("TERM like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("TERM not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("TERM in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("TERM not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("TERM between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("TERM not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(String value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(String value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(String value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(String value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLike(String value) {
            addCriterion("ORDER_TIME like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotLike(String value) {
            addCriterion("ORDER_TIME not like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<String> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<String> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(String value1, String value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("BRANCH_ID =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("BRANCH_ID <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("BRANCH_ID >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("BRANCH_ID <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("BRANCH_ID like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("BRANCH_ID not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("BRANCH_ID in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("BRANCH_ID not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("BRANCH_ID between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("BRANCH_ID not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNull() {
            addCriterion("MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(String value) {
            addCriterion("MER_ID =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(String value) {
            addCriterion("MER_ID <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(String value) {
            addCriterion("MER_ID >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ID >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(String value) {
            addCriterion("MER_ID <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(String value) {
            addCriterion("MER_ID <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLike(String value) {
            addCriterion("MER_ID like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotLike(String value) {
            addCriterion("MER_ID not like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<String> values) {
            addCriterion("MER_ID in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<String> values) {
            addCriterion("MER_ID not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(String value1, String value2) {
            addCriterion("MER_ID between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(String value1, String value2) {
            addCriterion("MER_ID not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNull() {
            addCriterion("MER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNotNull() {
            addCriterion("MER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEqualTo(String value) {
            addCriterion("MER_NAME =", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotEqualTo(String value) {
            addCriterion("MER_NAME <>", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThan(String value) {
            addCriterion("MER_NAME >", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NAME >=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThan(String value) {
            addCriterion("MER_NAME <", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThanOrEqualTo(String value) {
            addCriterion("MER_NAME <=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLike(String value) {
            addCriterion("MER_NAME like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotLike(String value) {
            addCriterion("MER_NAME not like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameIn(List<String> values) {
            addCriterion("MER_NAME in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotIn(List<String> values) {
            addCriterion("MER_NAME not in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameBetween(String value1, String value2) {
            addCriterion("MER_NAME between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotBetween(String value1, String value2) {
            addCriterion("MER_NAME not between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("PRODUCT_TYPE <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("PRODUCT_TYPE like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("PRODUCT_TYPE not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("ORDER_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("ORDER_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(String value) {
            addCriterion("ORDER_MONEY =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(String value) {
            addCriterion("ORDER_MONEY <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(String value) {
            addCriterion("ORDER_MONEY >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_MONEY >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(String value) {
            addCriterion("ORDER_MONEY <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(String value) {
            addCriterion("ORDER_MONEY <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLike(String value) {
            addCriterion("ORDER_MONEY like", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotLike(String value) {
            addCriterion("ORDER_MONEY not like", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<String> values) {
            addCriterion("ORDER_MONEY in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<String> values) {
            addCriterion("ORDER_MONEY not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(String value1, String value2) {
            addCriterion("ORDER_MONEY between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(String value1, String value2) {
            addCriterion("ORDER_MONEY not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIsNull() {
            addCriterion("JUDGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIsNotNull() {
            addCriterion("JUDGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeEqualTo(String value) {
            addCriterion("JUDGE_TYPE =", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotEqualTo(String value) {
            addCriterion("JUDGE_TYPE <>", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeGreaterThan(String value) {
            addCriterion("JUDGE_TYPE >", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("JUDGE_TYPE >=", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLessThan(String value) {
            addCriterion("JUDGE_TYPE <", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLessThanOrEqualTo(String value) {
            addCriterion("JUDGE_TYPE <=", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLike(String value) {
            addCriterion("JUDGE_TYPE like", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotLike(String value) {
            addCriterion("JUDGE_TYPE not like", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIn(List<String> values) {
            addCriterion("JUDGE_TYPE in", values, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotIn(List<String> values) {
            addCriterion("JUDGE_TYPE not in", values, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeBetween(String value1, String value2) {
            addCriterion("JUDGE_TYPE between", value1, value2, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotBetween(String value1, String value2) {
            addCriterion("JUDGE_TYPE not between", value1, value2, "judgeType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("PRODUCT_NO =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("PRODUCT_NO <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("PRODUCT_NO >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("PRODUCT_NO <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("PRODUCT_NO like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("PRODUCT_NO not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("PRODUCT_NO in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("PRODUCT_NO not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("DISPLAY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("DISPLAY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("DISPLAY_NAME =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("DISPLAY_NAME <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("DISPLAY_NAME >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAY_NAME >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("DISPLAY_NAME <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("DISPLAY_NAME <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("DISPLAY_NAME like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("DISPLAY_NAME not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("DISPLAY_NAME in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("DISPLAY_NAME not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("DISPLAY_NAME between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("DISPLAY_NAME not between", value1, value2, "displayName");
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