/*
 * @author Dongmin.lee
 * @since 2023-03-21
 * @version 23.03.21
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.jiraprojectversion.controller;

import com.arms.jiraprojectversion.model.JiraProjectVersionDTO;
import com.arms.jiraprojectversionlog.model.JiraProjectVersionLogEntity;
import com.egovframework.javaservice.treeframework.controller.CommonResponse;
import com.egovframework.javaservice.treeframework.controller.TreeAbstractController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import com.arms.jiraprojectversion.model.JiraProjectVersionEntity;
import com.arms.jiraprojectversion.service.JiraProjectVersion;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping(value = {"/arms/jiraProjectVersion"})
public class JiraProjectVersionController extends TreeAbstractController<JiraProjectVersion, JiraProjectVersionDTO, JiraProjectVersionEntity> {

    @Autowired
    @Qualifier("jiraProjectVersion")
    private JiraProjectVersion jiraProjectVersion;

    @PostConstruct
    public void initialize() {
        setTreeService(jiraProjectVersion);
        setTreeEntity(JiraProjectVersionEntity.class);
    }

	private final Logger logger = LoggerFactory.getLogger(this.getClass());


}
