package com.base.controller;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.base.util.SpringContextUtil;

/**
 * 定时任务控制器
 * 
 * @author viccai
 *
 */
@Component
public class JobController extends QuartzJobBean {

	private static Logger logger = Logger.getLogger(JobController.class);
	
	private SpringContextUtil springContextUtil;

	//系统确认课程任务
	private void confirmJob() {
		logger.info("执行已上课程确认任务start");
		/*IClassorderService classorderService = springContextUtil.getBean(IClassorderService.class);
		IHandleOrderService handleOrderService = springContextUtil.getBean(IHandleOrderService.class);*/

		logger.info("执行已上课程确认任务end");
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		confirmJob();
	}

}
