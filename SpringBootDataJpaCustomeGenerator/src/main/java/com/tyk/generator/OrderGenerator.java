package com.tyk.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderGenerator  implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prifix="OD";
		String suffix="";
		String select="select ORDERID.nextval from dual";
		try
		{
			Connection connection = session.connection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			if(resultSet.next())
			{
				int sequel = resultSet.getInt(1);
				suffix=String.valueOf(sequel);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prifix+suffix;
	}

}
