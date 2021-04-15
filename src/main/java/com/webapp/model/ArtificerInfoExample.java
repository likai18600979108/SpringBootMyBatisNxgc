package com.webapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtificerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtificerInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(String value) {
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(String value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(String value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(String value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLike(String value) {
            addCriterion("work_time like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotLike(String value) {
            addCriterion("work_time not like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<String> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<String> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(String value1, String value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(String value1, String value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("work_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("work_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(String value) {
            addCriterion("work_type =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(String value) {
            addCriterion("work_type <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(String value) {
            addCriterion("work_type >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("work_type >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(String value) {
            addCriterion("work_type <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(String value) {
            addCriterion("work_type <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLike(String value) {
            addCriterion("work_type like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotLike(String value) {
            addCriterion("work_type not like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<String> values) {
            addCriterion("work_type in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<String> values) {
            addCriterion("work_type not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(String value1, String value2) {
            addCriterion("work_type between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(String value1, String value2) {
            addCriterion("work_type not between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andCompanysIsNull() {
            addCriterion("companys is null");
            return (Criteria) this;
        }

        public Criteria andCompanysIsNotNull() {
            addCriterion("companys is not null");
            return (Criteria) this;
        }

        public Criteria andCompanysEqualTo(String value) {
            addCriterion("companys =", value, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysNotEqualTo(String value) {
            addCriterion("companys <>", value, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysGreaterThan(String value) {
            addCriterion("companys >", value, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysGreaterThanOrEqualTo(String value) {
            addCriterion("companys >=", value, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysLessThan(String value) {
            addCriterion("companys <", value, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysLessThanOrEqualTo(String value) {
            addCriterion("companys <=", value, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysLike(String value) {
            addCriterion("companys like", value, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysNotLike(String value) {
            addCriterion("companys not like", value, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysIn(List<String> values) {
            addCriterion("companys in", values, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysNotIn(List<String> values) {
            addCriterion("companys not in", values, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysBetween(String value1, String value2) {
            addCriterion("companys between", value1, value2, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanysNotBetween(String value1, String value2) {
            addCriterion("companys not between", value1, value2, "companys");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNull() {
            addCriterion("company_addr is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNotNull() {
            addCriterion("company_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrEqualTo(String value) {
            addCriterion("company_addr =", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotEqualTo(String value) {
            addCriterion("company_addr <>", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThan(String value) {
            addCriterion("company_addr >", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("company_addr >=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThan(String value) {
            addCriterion("company_addr <", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("company_addr <=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLike(String value) {
            addCriterion("company_addr like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotLike(String value) {
            addCriterion("company_addr not like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIn(List<String> values) {
            addCriterion("company_addr in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotIn(List<String> values) {
            addCriterion("company_addr not in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrBetween(String value1, String value2) {
            addCriterion("company_addr between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("company_addr not between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPubStatusIsNull() {
            addCriterion("pub_status is null");
            return (Criteria) this;
        }

        public Criteria andPubStatusIsNotNull() {
            addCriterion("pub_status is not null");
            return (Criteria) this;
        }

        public Criteria andPubStatusEqualTo(Integer value) {
            addCriterion("pub_status =", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotEqualTo(Integer value) {
            addCriterion("pub_status <>", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusGreaterThan(Integer value) {
            addCriterion("pub_status >", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pub_status >=", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusLessThan(Integer value) {
            addCriterion("pub_status <", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pub_status <=", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusIn(List<Integer> values) {
            addCriterion("pub_status in", values, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotIn(List<Integer> values) {
            addCriterion("pub_status not in", values, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusBetween(Integer value1, Integer value2) {
            addCriterion("pub_status between", value1, value2, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pub_status not between", value1, value2, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andDinatePositionIsNull() {
            addCriterion("dinate_position is null");
            return (Criteria) this;
        }

        public Criteria andDinatePositionIsNotNull() {
            addCriterion("dinate_position is not null");
            return (Criteria) this;
        }

        public Criteria andDinatePositionEqualTo(String value) {
            addCriterion("dinate_position =", value, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionNotEqualTo(String value) {
            addCriterion("dinate_position <>", value, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionGreaterThan(String value) {
            addCriterion("dinate_position >", value, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionGreaterThanOrEqualTo(String value) {
            addCriterion("dinate_position >=", value, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionLessThan(String value) {
            addCriterion("dinate_position <", value, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionLessThanOrEqualTo(String value) {
            addCriterion("dinate_position <=", value, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionLike(String value) {
            addCriterion("dinate_position like", value, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionNotLike(String value) {
            addCriterion("dinate_position not like", value, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionIn(List<String> values) {
            addCriterion("dinate_position in", values, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionNotIn(List<String> values) {
            addCriterion("dinate_position not in", values, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionBetween(String value1, String value2) {
            addCriterion("dinate_position between", value1, value2, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andDinatePositionNotBetween(String value1, String value2) {
            addCriterion("dinate_position not between", value1, value2, "dinatePosition");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIsNull() {
            addCriterion("coordinates is null");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIsNotNull() {
            addCriterion("coordinates is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinatesEqualTo(String value) {
            addCriterion("coordinates =", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotEqualTo(String value) {
            addCriterion("coordinates <>", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesGreaterThan(String value) {
            addCriterion("coordinates >", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesGreaterThanOrEqualTo(String value) {
            addCriterion("coordinates >=", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesLessThan(String value) {
            addCriterion("coordinates <", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesLessThanOrEqualTo(String value) {
            addCriterion("coordinates <=", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesLike(String value) {
            addCriterion("coordinates like", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotLike(String value) {
            addCriterion("coordinates not like", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIn(List<String> values) {
            addCriterion("coordinates in", values, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotIn(List<String> values) {
            addCriterion("coordinates not in", values, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesBetween(String value1, String value2) {
            addCriterion("coordinates between", value1, value2, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotBetween(String value1, String value2) {
            addCriterion("coordinates not between", value1, value2, "coordinates");
            return (Criteria) this;
        }

        public Criteria andRentAmountIsNull() {
            addCriterion("rent_amount is null");
            return (Criteria) this;
        }

        public Criteria andRentAmountIsNotNull() {
            addCriterion("rent_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRentAmountEqualTo(BigDecimal value) {
            addCriterion("rent_amount =", value, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountNotEqualTo(BigDecimal value) {
            addCriterion("rent_amount <>", value, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountGreaterThan(BigDecimal value) {
            addCriterion("rent_amount >", value, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rent_amount >=", value, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountLessThan(BigDecimal value) {
            addCriterion("rent_amount <", value, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rent_amount <=", value, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountIn(List<BigDecimal> values) {
            addCriterion("rent_amount in", values, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountNotIn(List<BigDecimal> values) {
            addCriterion("rent_amount not in", values, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent_amount between", value1, value2, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andRentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent_amount not between", value1, value2, "rentAmount");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagIsNull() {
            addCriterion("push_msg_flag is null");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagIsNotNull() {
            addCriterion("push_msg_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagEqualTo(Integer value) {
            addCriterion("push_msg_flag =", value, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagNotEqualTo(Integer value) {
            addCriterion("push_msg_flag <>", value, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagGreaterThan(Integer value) {
            addCriterion("push_msg_flag >", value, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_msg_flag >=", value, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagLessThan(Integer value) {
            addCriterion("push_msg_flag <", value, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagLessThanOrEqualTo(Integer value) {
            addCriterion("push_msg_flag <=", value, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagIn(List<Integer> values) {
            addCriterion("push_msg_flag in", values, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagNotIn(List<Integer> values) {
            addCriterion("push_msg_flag not in", values, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagBetween(Integer value1, Integer value2) {
            addCriterion("push_msg_flag between", value1, value2, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("push_msg_flag not between", value1, value2, "pushMsgFlag");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingIsNull() {
            addCriterion("push_msg_ring is null");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingIsNotNull() {
            addCriterion("push_msg_ring is not null");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingEqualTo(Integer value) {
            addCriterion("push_msg_ring =", value, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingNotEqualTo(Integer value) {
            addCriterion("push_msg_ring <>", value, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingGreaterThan(Integer value) {
            addCriterion("push_msg_ring >", value, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_msg_ring >=", value, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingLessThan(Integer value) {
            addCriterion("push_msg_ring <", value, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingLessThanOrEqualTo(Integer value) {
            addCriterion("push_msg_ring <=", value, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingIn(List<Integer> values) {
            addCriterion("push_msg_ring in", values, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingNotIn(List<Integer> values) {
            addCriterion("push_msg_ring not in", values, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingBetween(Integer value1, Integer value2) {
            addCriterion("push_msg_ring between", value1, value2, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andPushMsgRingNotBetween(Integer value1, Integer value2) {
            addCriterion("push_msg_ring not between", value1, value2, "pushMsgRing");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoIsNull() {
            addCriterion("certificate_photo is null");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoIsNotNull() {
            addCriterion("certificate_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoEqualTo(String value) {
            addCriterion("certificate_photo =", value, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoNotEqualTo(String value) {
            addCriterion("certificate_photo <>", value, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoGreaterThan(String value) {
            addCriterion("certificate_photo >", value, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_photo >=", value, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoLessThan(String value) {
            addCriterion("certificate_photo <", value, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoLessThanOrEqualTo(String value) {
            addCriterion("certificate_photo <=", value, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoLike(String value) {
            addCriterion("certificate_photo like", value, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoNotLike(String value) {
            addCriterion("certificate_photo not like", value, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoIn(List<String> values) {
            addCriterion("certificate_photo in", values, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoNotIn(List<String> values) {
            addCriterion("certificate_photo not in", values, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoBetween(String value1, String value2) {
            addCriterion("certificate_photo between", value1, value2, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andCertificatePhotoNotBetween(String value1, String value2) {
            addCriterion("certificate_photo not between", value1, value2, "certificatePhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoIsNull() {
            addCriterion("front_photo is null");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoIsNotNull() {
            addCriterion("front_photo is not null");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoEqualTo(String value) {
            addCriterion("front_photo =", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoNotEqualTo(String value) {
            addCriterion("front_photo <>", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoGreaterThan(String value) {
            addCriterion("front_photo >", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("front_photo >=", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoLessThan(String value) {
            addCriterion("front_photo <", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoLessThanOrEqualTo(String value) {
            addCriterion("front_photo <=", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoLike(String value) {
            addCriterion("front_photo like", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoNotLike(String value) {
            addCriterion("front_photo not like", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoIn(List<String> values) {
            addCriterion("front_photo in", values, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoNotIn(List<String> values) {
            addCriterion("front_photo not in", values, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoBetween(String value1, String value2) {
            addCriterion("front_photo between", value1, value2, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoNotBetween(String value1, String value2) {
            addCriterion("front_photo not between", value1, value2, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoIsNull() {
            addCriterion("back_photo is null");
            return (Criteria) this;
        }

        public Criteria andBackPhotoIsNotNull() {
            addCriterion("back_photo is not null");
            return (Criteria) this;
        }

        public Criteria andBackPhotoEqualTo(String value) {
            addCriterion("back_photo =", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoNotEqualTo(String value) {
            addCriterion("back_photo <>", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoGreaterThan(String value) {
            addCriterion("back_photo >", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("back_photo >=", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoLessThan(String value) {
            addCriterion("back_photo <", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoLessThanOrEqualTo(String value) {
            addCriterion("back_photo <=", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoLike(String value) {
            addCriterion("back_photo like", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoNotLike(String value) {
            addCriterion("back_photo not like", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoIn(List<String> values) {
            addCriterion("back_photo in", values, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoNotIn(List<String> values) {
            addCriterion("back_photo not in", values, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoBetween(String value1, String value2) {
            addCriterion("back_photo between", value1, value2, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoNotBetween(String value1, String value2) {
            addCriterion("back_photo not between", value1, value2, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andAuditDataIsNull() {
            addCriterion("audit_data is null");
            return (Criteria) this;
        }

        public Criteria andAuditDataIsNotNull() {
            addCriterion("audit_data is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDataEqualTo(String value) {
            addCriterion("audit_data =", value, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataNotEqualTo(String value) {
            addCriterion("audit_data <>", value, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataGreaterThan(String value) {
            addCriterion("audit_data >", value, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataGreaterThanOrEqualTo(String value) {
            addCriterion("audit_data >=", value, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataLessThan(String value) {
            addCriterion("audit_data <", value, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataLessThanOrEqualTo(String value) {
            addCriterion("audit_data <=", value, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataLike(String value) {
            addCriterion("audit_data like", value, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataNotLike(String value) {
            addCriterion("audit_data not like", value, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataIn(List<String> values) {
            addCriterion("audit_data in", values, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataNotIn(List<String> values) {
            addCriterion("audit_data not in", values, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataBetween(String value1, String value2) {
            addCriterion("audit_data between", value1, value2, "auditData");
            return (Criteria) this;
        }

        public Criteria andAuditDataNotBetween(String value1, String value2) {
            addCriterion("audit_data not between", value1, value2, "auditData");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("app_version is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("app_version is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("app_version =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("app_version <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("app_version >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("app_version >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("app_version <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("app_version <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("app_version like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("app_version not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("app_version in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("app_version not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("app_version between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("app_version not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditIsNull() {
            addCriterion("is_uhoer_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditIsNotNull() {
            addCriterion("is_uhoer_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditEqualTo(Integer value) {
            addCriterion("is_uhoer_audit =", value, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditNotEqualTo(Integer value) {
            addCriterion("is_uhoer_audit <>", value, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditGreaterThan(Integer value) {
            addCriterion("is_uhoer_audit >", value, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_uhoer_audit >=", value, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditLessThan(Integer value) {
            addCriterion("is_uhoer_audit <", value, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditLessThanOrEqualTo(Integer value) {
            addCriterion("is_uhoer_audit <=", value, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditIn(List<Integer> values) {
            addCriterion("is_uhoer_audit in", values, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditNotIn(List<Integer> values) {
            addCriterion("is_uhoer_audit not in", values, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditBetween(Integer value1, Integer value2) {
            addCriterion("is_uhoer_audit between", value1, value2, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andIsUhoerAuditNotBetween(Integer value1, Integer value2) {
            addCriterion("is_uhoer_audit not between", value1, value2, "isUhoerAudit");
            return (Criteria) this;
        }

        public Criteria andArtlevelIsNull() {
            addCriterion("artlevel is null");
            return (Criteria) this;
        }

        public Criteria andArtlevelIsNotNull() {
            addCriterion("artlevel is not null");
            return (Criteria) this;
        }

        public Criteria andArtlevelEqualTo(String value) {
            addCriterion("artlevel =", value, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelNotEqualTo(String value) {
            addCriterion("artlevel <>", value, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelGreaterThan(String value) {
            addCriterion("artlevel >", value, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelGreaterThanOrEqualTo(String value) {
            addCriterion("artlevel >=", value, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelLessThan(String value) {
            addCriterion("artlevel <", value, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelLessThanOrEqualTo(String value) {
            addCriterion("artlevel <=", value, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelLike(String value) {
            addCriterion("artlevel like", value, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelNotLike(String value) {
            addCriterion("artlevel not like", value, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelIn(List<String> values) {
            addCriterion("artlevel in", values, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelNotIn(List<String> values) {
            addCriterion("artlevel not in", values, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelBetween(String value1, String value2) {
            addCriterion("artlevel between", value1, value2, "artlevel");
            return (Criteria) this;
        }

        public Criteria andArtlevelNotBetween(String value1, String value2) {
            addCriterion("artlevel not between", value1, value2, "artlevel");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeIsNull() {
            addCriterion("start_work_time is null");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeIsNotNull() {
            addCriterion("start_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeEqualTo(String value) {
            addCriterion("start_work_time =", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeNotEqualTo(String value) {
            addCriterion("start_work_time <>", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeGreaterThan(String value) {
            addCriterion("start_work_time >", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_work_time >=", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeLessThan(String value) {
            addCriterion("start_work_time <", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("start_work_time <=", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeLike(String value) {
            addCriterion("start_work_time like", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeNotLike(String value) {
            addCriterion("start_work_time not like", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeIn(List<String> values) {
            addCriterion("start_work_time in", values, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeNotIn(List<String> values) {
            addCriterion("start_work_time not in", values, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeBetween(String value1, String value2) {
            addCriterion("start_work_time between", value1, value2, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeNotBetween(String value1, String value2) {
            addCriterion("start_work_time not between", value1, value2, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditIsNull() {
            addCriterion("is_auto_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditIsNotNull() {
            addCriterion("is_auto_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditEqualTo(Integer value) {
            addCriterion("is_auto_audit =", value, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditNotEqualTo(Integer value) {
            addCriterion("is_auto_audit <>", value, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditGreaterThan(Integer value) {
            addCriterion("is_auto_audit >", value, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_auto_audit >=", value, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditLessThan(Integer value) {
            addCriterion("is_auto_audit <", value, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditLessThanOrEqualTo(Integer value) {
            addCriterion("is_auto_audit <=", value, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditIn(List<Integer> values) {
            addCriterion("is_auto_audit in", values, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditNotIn(List<Integer> values) {
            addCriterion("is_auto_audit not in", values, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditBetween(Integer value1, Integer value2) {
            addCriterion("is_auto_audit between", value1, value2, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsAutoAuditNotBetween(Integer value1, Integer value2) {
            addCriterion("is_auto_audit not between", value1, value2, "isAutoAudit");
            return (Criteria) this;
        }

        public Criteria andIsShelfIsNull() {
            addCriterion("is_shelf is null");
            return (Criteria) this;
        }

        public Criteria andIsShelfIsNotNull() {
            addCriterion("is_shelf is not null");
            return (Criteria) this;
        }

        public Criteria andIsShelfEqualTo(Integer value) {
            addCriterion("is_shelf =", value, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfNotEqualTo(Integer value) {
            addCriterion("is_shelf <>", value, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfGreaterThan(Integer value) {
            addCriterion("is_shelf >", value, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_shelf >=", value, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfLessThan(Integer value) {
            addCriterion("is_shelf <", value, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfLessThanOrEqualTo(Integer value) {
            addCriterion("is_shelf <=", value, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfIn(List<Integer> values) {
            addCriterion("is_shelf in", values, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfNotIn(List<Integer> values) {
            addCriterion("is_shelf not in", values, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfBetween(Integer value1, Integer value2) {
            addCriterion("is_shelf between", value1, value2, "isShelf");
            return (Criteria) this;
        }

        public Criteria andIsShelfNotBetween(Integer value1, Integer value2) {
            addCriterion("is_shelf not between", value1, value2, "isShelf");
            return (Criteria) this;
        }

        public Criteria andShelfTimeIsNull() {
            addCriterion("shelf_time is null");
            return (Criteria) this;
        }

        public Criteria andShelfTimeIsNotNull() {
            addCriterion("shelf_time is not null");
            return (Criteria) this;
        }

        public Criteria andShelfTimeEqualTo(Date value) {
            addCriterion("shelf_time =", value, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeNotEqualTo(Date value) {
            addCriterion("shelf_time <>", value, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeGreaterThan(Date value) {
            addCriterion("shelf_time >", value, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shelf_time >=", value, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeLessThan(Date value) {
            addCriterion("shelf_time <", value, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeLessThanOrEqualTo(Date value) {
            addCriterion("shelf_time <=", value, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeIn(List<Date> values) {
            addCriterion("shelf_time in", values, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeNotIn(List<Date> values) {
            addCriterion("shelf_time not in", values, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeBetween(Date value1, Date value2) {
            addCriterion("shelf_time between", value1, value2, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andShelfTimeNotBetween(Date value1, Date value2) {
            addCriterion("shelf_time not between", value1, value2, "shelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeIsNull() {
            addCriterion("first_shelf_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeIsNotNull() {
            addCriterion("first_shelf_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeEqualTo(Date value) {
            addCriterion("first_shelf_time =", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeNotEqualTo(Date value) {
            addCriterion("first_shelf_time <>", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeGreaterThan(Date value) {
            addCriterion("first_shelf_time >", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_shelf_time >=", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeLessThan(Date value) {
            addCriterion("first_shelf_time <", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_shelf_time <=", value, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeIn(List<Date> values) {
            addCriterion("first_shelf_time in", values, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeNotIn(List<Date> values) {
            addCriterion("first_shelf_time not in", values, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeBetween(Date value1, Date value2) {
            addCriterion("first_shelf_time between", value1, value2, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andFirstShelfTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_shelf_time not between", value1, value2, "firstShelfTime");
            return (Criteria) this;
        }

        public Criteria andHourPriceIsNull() {
            addCriterion("hour_price is null");
            return (Criteria) this;
        }

        public Criteria andHourPriceIsNotNull() {
            addCriterion("hour_price is not null");
            return (Criteria) this;
        }

        public Criteria andHourPriceEqualTo(Double value) {
            addCriterion("hour_price =", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceNotEqualTo(Double value) {
            addCriterion("hour_price <>", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceGreaterThan(Double value) {
            addCriterion("hour_price >", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hour_price >=", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceLessThan(Double value) {
            addCriterion("hour_price <", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceLessThanOrEqualTo(Double value) {
            addCriterion("hour_price <=", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceIn(List<Double> values) {
            addCriterion("hour_price in", values, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceNotIn(List<Double> values) {
            addCriterion("hour_price not in", values, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceBetween(Double value1, Double value2) {
            addCriterion("hour_price between", value1, value2, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceNotBetween(Double value1, Double value2) {
            addCriterion("hour_price not between", value1, value2, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceIsNull() {
            addCriterion("self_introduce is null");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceIsNotNull() {
            addCriterion("self_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceEqualTo(String value) {
            addCriterion("self_introduce =", value, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceNotEqualTo(String value) {
            addCriterion("self_introduce <>", value, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceGreaterThan(String value) {
            addCriterion("self_introduce >", value, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("self_introduce >=", value, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceLessThan(String value) {
            addCriterion("self_introduce <", value, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceLessThanOrEqualTo(String value) {
            addCriterion("self_introduce <=", value, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceLike(String value) {
            addCriterion("self_introduce like", value, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceNotLike(String value) {
            addCriterion("self_introduce not like", value, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceIn(List<String> values) {
            addCriterion("self_introduce in", values, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceNotIn(List<String> values) {
            addCriterion("self_introduce not in", values, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceBetween(String value1, String value2) {
            addCriterion("self_introduce between", value1, value2, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andSelfIntroduceNotBetween(String value1, String value2) {
            addCriterion("self_introduce not between", value1, value2, "selfIntroduce");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceIsNull() {
            addCriterion("get_order_distance is null");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceIsNotNull() {
            addCriterion("get_order_distance is not null");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceEqualTo(Double value) {
            addCriterion("get_order_distance =", value, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceNotEqualTo(Double value) {
            addCriterion("get_order_distance <>", value, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceGreaterThan(Double value) {
            addCriterion("get_order_distance >", value, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("get_order_distance >=", value, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceLessThan(Double value) {
            addCriterion("get_order_distance <", value, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceLessThanOrEqualTo(Double value) {
            addCriterion("get_order_distance <=", value, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceIn(List<Double> values) {
            addCriterion("get_order_distance in", values, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceNotIn(List<Double> values) {
            addCriterion("get_order_distance not in", values, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceBetween(Double value1, Double value2) {
            addCriterion("get_order_distance between", value1, value2, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andGetOrderDistanceNotBetween(Double value1, Double value2) {
            addCriterion("get_order_distance not between", value1, value2, "getOrderDistance");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountIsNull() {
            addCriterion("seller_browse_count is null");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountIsNotNull() {
            addCriterion("seller_browse_count is not null");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountEqualTo(Integer value) {
            addCriterion("seller_browse_count =", value, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountNotEqualTo(Integer value) {
            addCriterion("seller_browse_count <>", value, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountGreaterThan(Integer value) {
            addCriterion("seller_browse_count >", value, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_browse_count >=", value, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountLessThan(Integer value) {
            addCriterion("seller_browse_count <", value, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountLessThanOrEqualTo(Integer value) {
            addCriterion("seller_browse_count <=", value, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountIn(List<Integer> values) {
            addCriterion("seller_browse_count in", values, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountNotIn(List<Integer> values) {
            addCriterion("seller_browse_count not in", values, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountBetween(Integer value1, Integer value2) {
            addCriterion("seller_browse_count between", value1, value2, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andSellerBrowseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_browse_count not between", value1, value2, "sellerBrowseCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNull() {
            addCriterion("share_count is null");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNotNull() {
            addCriterion("share_count is not null");
            return (Criteria) this;
        }

        public Criteria andShareCountEqualTo(Integer value) {
            addCriterion("share_count =", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotEqualTo(Integer value) {
            addCriterion("share_count <>", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThan(Integer value) {
            addCriterion("share_count >", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_count >=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThan(Integer value) {
            addCriterion("share_count <", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThanOrEqualTo(Integer value) {
            addCriterion("share_count <=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIn(List<Integer> values) {
            addCriterion("share_count in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotIn(List<Integer> values) {
            addCriterion("share_count not in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountBetween(Integer value1, Integer value2) {
            addCriterion("share_count between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotBetween(Integer value1, Integer value2) {
            addCriterion("share_count not between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchIsNull() {
            addCriterion("paidan_switch is null");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchIsNotNull() {
            addCriterion("paidan_switch is not null");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchEqualTo(Integer value) {
            addCriterion("paidan_switch =", value, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchNotEqualTo(Integer value) {
            addCriterion("paidan_switch <>", value, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchGreaterThan(Integer value) {
            addCriterion("paidan_switch >", value, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("paidan_switch >=", value, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchLessThan(Integer value) {
            addCriterion("paidan_switch <", value, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("paidan_switch <=", value, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchIn(List<Integer> values) {
            addCriterion("paidan_switch in", values, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchNotIn(List<Integer> values) {
            addCriterion("paidan_switch not in", values, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchBetween(Integer value1, Integer value2) {
            addCriterion("paidan_switch between", value1, value2, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andPaidanSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("paidan_switch not between", value1, value2, "paidanSwitch");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesIsNull() {
            addCriterion("get_order_coordinates is null");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesIsNotNull() {
            addCriterion("get_order_coordinates is not null");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesEqualTo(String value) {
            addCriterion("get_order_coordinates =", value, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesNotEqualTo(String value) {
            addCriterion("get_order_coordinates <>", value, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesGreaterThan(String value) {
            addCriterion("get_order_coordinates >", value, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesGreaterThanOrEqualTo(String value) {
            addCriterion("get_order_coordinates >=", value, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesLessThan(String value) {
            addCriterion("get_order_coordinates <", value, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesLessThanOrEqualTo(String value) {
            addCriterion("get_order_coordinates <=", value, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesLike(String value) {
            addCriterion("get_order_coordinates like", value, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesNotLike(String value) {
            addCriterion("get_order_coordinates not like", value, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesIn(List<String> values) {
            addCriterion("get_order_coordinates in", values, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesNotIn(List<String> values) {
            addCriterion("get_order_coordinates not in", values, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesBetween(String value1, String value2) {
            addCriterion("get_order_coordinates between", value1, value2, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andGetOrderCoordinatesNotBetween(String value1, String value2) {
            addCriterion("get_order_coordinates not between", value1, value2, "getOrderCoordinates");
            return (Criteria) this;
        }

        public Criteria andDayPriceIsNull() {
            addCriterion("day_price is null");
            return (Criteria) this;
        }

        public Criteria andDayPriceIsNotNull() {
            addCriterion("day_price is not null");
            return (Criteria) this;
        }

        public Criteria andDayPriceEqualTo(Double value) {
            addCriterion("day_price =", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotEqualTo(Double value) {
            addCriterion("day_price <>", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceGreaterThan(Double value) {
            addCriterion("day_price >", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("day_price >=", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLessThan(Double value) {
            addCriterion("day_price <", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLessThanOrEqualTo(Double value) {
            addCriterion("day_price <=", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceIn(List<Double> values) {
            addCriterion("day_price in", values, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotIn(List<Double> values) {
            addCriterion("day_price not in", values, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceBetween(Double value1, Double value2) {
            addCriterion("day_price between", value1, value2, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotBetween(Double value1, Double value2) {
            addCriterion("day_price not between", value1, value2, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIsNull() {
            addCriterion("price_status is null");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIsNotNull() {
            addCriterion("price_status is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStatusEqualTo(Integer value) {
            addCriterion("price_status =", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotEqualTo(Integer value) {
            addCriterion("price_status <>", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusGreaterThan(Integer value) {
            addCriterion("price_status >", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_status >=", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLessThan(Integer value) {
            addCriterion("price_status <", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("price_status <=", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIn(List<Integer> values) {
            addCriterion("price_status in", values, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotIn(List<Integer> values) {
            addCriterion("price_status not in", values, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusBetween(Integer value1, Integer value2) {
            addCriterion("price_status between", value1, value2, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("price_status not between", value1, value2, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusIsNull() {
            addCriterion("popup_status is null");
            return (Criteria) this;
        }

        public Criteria andPopupStatusIsNotNull() {
            addCriterion("popup_status is not null");
            return (Criteria) this;
        }

        public Criteria andPopupStatusEqualTo(Integer value) {
            addCriterion("popup_status =", value, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusNotEqualTo(Integer value) {
            addCriterion("popup_status <>", value, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusGreaterThan(Integer value) {
            addCriterion("popup_status >", value, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("popup_status >=", value, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusLessThan(Integer value) {
            addCriterion("popup_status <", value, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusLessThanOrEqualTo(Integer value) {
            addCriterion("popup_status <=", value, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusIn(List<Integer> values) {
            addCriterion("popup_status in", values, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusNotIn(List<Integer> values) {
            addCriterion("popup_status not in", values, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusBetween(Integer value1, Integer value2) {
            addCriterion("popup_status between", value1, value2, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andPopupStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("popup_status not between", value1, value2, "popupStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerIsNull() {
            addCriterion("distribute_artificer is null");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerIsNotNull() {
            addCriterion("distribute_artificer is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerEqualTo(Integer value) {
            addCriterion("distribute_artificer =", value, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerNotEqualTo(Integer value) {
            addCriterion("distribute_artificer <>", value, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerGreaterThan(Integer value) {
            addCriterion("distribute_artificer >", value, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribute_artificer >=", value, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerLessThan(Integer value) {
            addCriterion("distribute_artificer <", value, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerLessThanOrEqualTo(Integer value) {
            addCriterion("distribute_artificer <=", value, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerIn(List<Integer> values) {
            addCriterion("distribute_artificer in", values, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerNotIn(List<Integer> values) {
            addCriterion("distribute_artificer not in", values, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerBetween(Integer value1, Integer value2) {
            addCriterion("distribute_artificer between", value1, value2, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andDistributeArtificerNotBetween(Integer value1, Integer value2) {
            addCriterion("distribute_artificer not between", value1, value2, "distributeArtificer");
            return (Criteria) this;
        }

        public Criteria andCancelNumIsNull() {
            addCriterion("cancel_num is null");
            return (Criteria) this;
        }

        public Criteria andCancelNumIsNotNull() {
            addCriterion("cancel_num is not null");
            return (Criteria) this;
        }

        public Criteria andCancelNumEqualTo(Integer value) {
            addCriterion("cancel_num =", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumNotEqualTo(Integer value) {
            addCriterion("cancel_num <>", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumGreaterThan(Integer value) {
            addCriterion("cancel_num >", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_num >=", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumLessThan(Integer value) {
            addCriterion("cancel_num <", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_num <=", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumIn(List<Integer> values) {
            addCriterion("cancel_num in", values, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumNotIn(List<Integer> values) {
            addCriterion("cancel_num not in", values, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumBetween(Integer value1, Integer value2) {
            addCriterion("cancel_num between", value1, value2, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_num not between", value1, value2, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdIsNull() {
            addCriterion("housekeeper_id is null");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdIsNotNull() {
            addCriterion("housekeeper_id is not null");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdEqualTo(Integer value) {
            addCriterion("housekeeper_id =", value, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdNotEqualTo(Integer value) {
            addCriterion("housekeeper_id <>", value, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdGreaterThan(Integer value) {
            addCriterion("housekeeper_id >", value, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("housekeeper_id >=", value, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdLessThan(Integer value) {
            addCriterion("housekeeper_id <", value, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdLessThanOrEqualTo(Integer value) {
            addCriterion("housekeeper_id <=", value, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdIn(List<Integer> values) {
            addCriterion("housekeeper_id in", values, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdNotIn(List<Integer> values) {
            addCriterion("housekeeper_id not in", values, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdBetween(Integer value1, Integer value2) {
            addCriterion("housekeeper_id between", value1, value2, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andHousekeeperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("housekeeper_id not between", value1, value2, "housekeeperId");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchIsNull() {
            addCriterion("order_switch is null");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchIsNotNull() {
            addCriterion("order_switch is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchEqualTo(Integer value) {
            addCriterion("order_switch =", value, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchNotEqualTo(Integer value) {
            addCriterion("order_switch <>", value, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchGreaterThan(Integer value) {
            addCriterion("order_switch >", value, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_switch >=", value, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchLessThan(Integer value) {
            addCriterion("order_switch <", value, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("order_switch <=", value, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchIn(List<Integer> values) {
            addCriterion("order_switch in", values, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchNotIn(List<Integer> values) {
            addCriterion("order_switch not in", values, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchBetween(Integer value1, Integer value2) {
            addCriterion("order_switch between", value1, value2, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andOrderSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("order_switch not between", value1, value2, "orderSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchIsNull() {
            addCriterion("rob_switch is null");
            return (Criteria) this;
        }

        public Criteria andRobSwitchIsNotNull() {
            addCriterion("rob_switch is not null");
            return (Criteria) this;
        }

        public Criteria andRobSwitchEqualTo(Integer value) {
            addCriterion("rob_switch =", value, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchNotEqualTo(Integer value) {
            addCriterion("rob_switch <>", value, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchGreaterThan(Integer value) {
            addCriterion("rob_switch >", value, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("rob_switch >=", value, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchLessThan(Integer value) {
            addCriterion("rob_switch <", value, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("rob_switch <=", value, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchIn(List<Integer> values) {
            addCriterion("rob_switch in", values, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchNotIn(List<Integer> values) {
            addCriterion("rob_switch not in", values, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchBetween(Integer value1, Integer value2) {
            addCriterion("rob_switch between", value1, value2, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andRobSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("rob_switch not between", value1, value2, "robSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchIsNull() {
            addCriterion("distribute_switch is null");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchIsNotNull() {
            addCriterion("distribute_switch is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchEqualTo(Integer value) {
            addCriterion("distribute_switch =", value, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchNotEqualTo(Integer value) {
            addCriterion("distribute_switch <>", value, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchGreaterThan(Integer value) {
            addCriterion("distribute_switch >", value, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribute_switch >=", value, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchLessThan(Integer value) {
            addCriterion("distribute_switch <", value, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("distribute_switch <=", value, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchIn(List<Integer> values) {
            addCriterion("distribute_switch in", values, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchNotIn(List<Integer> values) {
            addCriterion("distribute_switch not in", values, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchBetween(Integer value1, Integer value2) {
            addCriterion("distribute_switch between", value1, value2, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andDistributeSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("distribute_switch not between", value1, value2, "distributeSwitch");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainIsNull() {
            addCriterion("artificer_train is null");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainIsNotNull() {
            addCriterion("artificer_train is not null");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainEqualTo(Integer value) {
            addCriterion("artificer_train =", value, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainNotEqualTo(Integer value) {
            addCriterion("artificer_train <>", value, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainGreaterThan(Integer value) {
            addCriterion("artificer_train >", value, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainGreaterThanOrEqualTo(Integer value) {
            addCriterion("artificer_train >=", value, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainLessThan(Integer value) {
            addCriterion("artificer_train <", value, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainLessThanOrEqualTo(Integer value) {
            addCriterion("artificer_train <=", value, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainIn(List<Integer> values) {
            addCriterion("artificer_train in", values, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainNotIn(List<Integer> values) {
            addCriterion("artificer_train not in", values, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainBetween(Integer value1, Integer value2) {
            addCriterion("artificer_train between", value1, value2, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andArtificerTrainNotBetween(Integer value1, Integer value2) {
            addCriterion("artificer_train not between", value1, value2, "artificerTrain");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewIsNull() {
            addCriterion("wait_video_interview is null");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewIsNotNull() {
            addCriterion("wait_video_interview is not null");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewEqualTo(Integer value) {
            addCriterion("wait_video_interview =", value, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewNotEqualTo(Integer value) {
            addCriterion("wait_video_interview <>", value, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewGreaterThan(Integer value) {
            addCriterion("wait_video_interview >", value, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("wait_video_interview >=", value, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewLessThan(Integer value) {
            addCriterion("wait_video_interview <", value, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewLessThanOrEqualTo(Integer value) {
            addCriterion("wait_video_interview <=", value, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewIn(List<Integer> values) {
            addCriterion("wait_video_interview in", values, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewNotIn(List<Integer> values) {
            addCriterion("wait_video_interview not in", values, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewBetween(Integer value1, Integer value2) {
            addCriterion("wait_video_interview between", value1, value2, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andWaitVideoInterviewNotBetween(Integer value1, Integer value2) {
            addCriterion("wait_video_interview not between", value1, value2, "waitVideoInterview");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIsNull() {
            addCriterion("entry_status is null");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIsNotNull() {
            addCriterion("entry_status is not null");
            return (Criteria) this;
        }

        public Criteria andEntryStatusEqualTo(Integer value) {
            addCriterion("entry_status =", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotEqualTo(Integer value) {
            addCriterion("entry_status <>", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusGreaterThan(Integer value) {
            addCriterion("entry_status >", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("entry_status >=", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusLessThan(Integer value) {
            addCriterion("entry_status <", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("entry_status <=", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIn(List<Integer> values) {
            addCriterion("entry_status in", values, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotIn(List<Integer> values) {
            addCriterion("entry_status not in", values, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusBetween(Integer value1, Integer value2) {
            addCriterion("entry_status between", value1, value2, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("entry_status not between", value1, value2, "entryStatus");
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