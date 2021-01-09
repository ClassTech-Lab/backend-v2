package com.classtechlab.manager.infrastructure.datasource._configuration.type.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class UUIDTypeHandler extends BaseTypeHandler<UUID> {
    @Override
    public void setNonNullParameter(final PreparedStatement ps, final int i, final UUID parameter, final JdbcType jdbcType) throws SQLException {
        if (parameter != null) ps.setObject(i, parameter);
    }

    @Override
    public UUID getNullableResult(final ResultSet rs, final String columnName) throws SQLException {
        return uuid(rs.getString(columnName));
    }

    @Override
    public UUID getNullableResult(final ResultSet rs, final int columnIndex) throws SQLException {
        return uuid(rs.getString(columnIndex));
    }

    @Override
    public UUID getNullableResult(final CallableStatement cs, final int columnIndex) throws SQLException {
        return uuid(cs.getString(columnIndex));
    }

    private static UUID uuid(final String value) {
        try {
            return UUID.fromString(value);
        } catch (NullPointerException e) {
            return null;
        }
    }
}
