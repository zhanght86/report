/*
 * Tceon.com Inc.
 * Copyright (c) 2009 All Rights Reserved.
 */
package com.taicang.mscz.report.common.dal.daointerface;

// auto generated imports
import com.taicang.mscz.report.common.dal.dataobject.ReportFieldMappingDO;
import java.util.List;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>report_field_mapping</tt>.
 *
 * This file is generated by <tt>paygw-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/report_field_mapping.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>paygw-dalgen</tt> 
 * to generate this file.
 *
 * @author Cheng Li
 */
public interface ReportFieldMappingDAO {
	/**
	 *  Query DB table <tt>report_field_mapping</tt> for records.
	 *
   	 *  <p>
   	 *  Description for this operation is<br>
   	 *  <tt></tt>
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from report_field_mapping where (report_id = ?)</tt>
	 *
	 *	@param reportId
	 *	@return List<ReportFieldMappingDO>
	 *	@throws DataAccessException
	 */	 
    public List<ReportFieldMappingDO> getByReportId(int reportId) throws DataAccessException;

	/**
	 *  Insert one <tt>ReportFieldMappingDO</tt> object to DB table <tt>report_field_mapping</tt>, return primary key
	 *
   	 *  <p>
   	 *  Description for this operation is<br>
   	 *  <tt></tt>
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into report_field_mapping(report_id,biz_field,db_field) values (?, ?, ?)</tt>
	 *
	 *	@param reportFieldMapping
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int insert(ReportFieldMappingDO reportFieldMapping) throws DataAccessException;

}