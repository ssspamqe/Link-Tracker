/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema;


import edu.java.domain.jooq.information_schema.tables.AdministrableRoleAuthorizations;
import edu.java.domain.jooq.information_schema.tables.ApplicableRoles;
import edu.java.domain.jooq.information_schema.tables.Attributes;
import edu.java.domain.jooq.information_schema.tables.CharacterSets;
import edu.java.domain.jooq.information_schema.tables.CheckConstraintRoutineUsage;
import edu.java.domain.jooq.information_schema.tables.CheckConstraints;
import edu.java.domain.jooq.information_schema.tables.CollationCharacterSetApplicability;
import edu.java.domain.jooq.information_schema.tables.Collations;
import edu.java.domain.jooq.information_schema.tables.ColumnColumnUsage;
import edu.java.domain.jooq.information_schema.tables.ColumnDomainUsage;
import edu.java.domain.jooq.information_schema.tables.ColumnOptions;
import edu.java.domain.jooq.information_schema.tables.ColumnPrivileges;
import edu.java.domain.jooq.information_schema.tables.ColumnUdtUsage;
import edu.java.domain.jooq.information_schema.tables.Columns;
import edu.java.domain.jooq.information_schema.tables.ConstraintColumnUsage;
import edu.java.domain.jooq.information_schema.tables.ConstraintTableUsage;
import edu.java.domain.jooq.information_schema.tables.DataTypePrivileges;
import edu.java.domain.jooq.information_schema.tables.DomainConstraints;
import edu.java.domain.jooq.information_schema.tables.DomainUdtUsage;
import edu.java.domain.jooq.information_schema.tables.Domains;
import edu.java.domain.jooq.information_schema.tables.ElementTypes;
import edu.java.domain.jooq.information_schema.tables.EnabledRoles;
import edu.java.domain.jooq.information_schema.tables.ForeignDataWrapperOptions;
import edu.java.domain.jooq.information_schema.tables.ForeignDataWrappers;
import edu.java.domain.jooq.information_schema.tables.ForeignServerOptions;
import edu.java.domain.jooq.information_schema.tables.ForeignServers;
import edu.java.domain.jooq.information_schema.tables.ForeignTableOptions;
import edu.java.domain.jooq.information_schema.tables.ForeignTables;
import edu.java.domain.jooq.information_schema.tables.InformationSchemaCatalogName;
import edu.java.domain.jooq.information_schema.tables.KeyColumnUsage;
import edu.java.domain.jooq.information_schema.tables.Parameters;
import edu.java.domain.jooq.information_schema.tables.ReferentialConstraints;
import edu.java.domain.jooq.information_schema.tables.RoleColumnGrants;
import edu.java.domain.jooq.information_schema.tables.RoleRoutineGrants;
import edu.java.domain.jooq.information_schema.tables.RoleTableGrants;
import edu.java.domain.jooq.information_schema.tables.RoleUdtGrants;
import edu.java.domain.jooq.information_schema.tables.RoleUsageGrants;
import edu.java.domain.jooq.information_schema.tables.RoutineColumnUsage;
import edu.java.domain.jooq.information_schema.tables.RoutinePrivileges;
import edu.java.domain.jooq.information_schema.tables.RoutineRoutineUsage;
import edu.java.domain.jooq.information_schema.tables.RoutineSequenceUsage;
import edu.java.domain.jooq.information_schema.tables.RoutineTableUsage;
import edu.java.domain.jooq.information_schema.tables.Routines;
import edu.java.domain.jooq.information_schema.tables.Schemata;
import edu.java.domain.jooq.information_schema.tables.Sequences;
import edu.java.domain.jooq.information_schema.tables.SqlFeatures;
import edu.java.domain.jooq.information_schema.tables.SqlImplementationInfo;
import edu.java.domain.jooq.information_schema.tables.SqlParts;
import edu.java.domain.jooq.information_schema.tables.SqlSizing;
import edu.java.domain.jooq.information_schema.tables.TableConstraints;
import edu.java.domain.jooq.information_schema.tables.TablePrivileges;
import edu.java.domain.jooq.information_schema.tables.Transforms;
import edu.java.domain.jooq.information_schema.tables.TriggeredUpdateColumns;
import edu.java.domain.jooq.information_schema.tables.Triggers;
import edu.java.domain.jooq.information_schema.tables.UdtPrivileges;
import edu.java.domain.jooq.information_schema.tables.UsagePrivileges;
import edu.java.domain.jooq.information_schema.tables.UserDefinedTypes;
import edu.java.domain.jooq.information_schema.tables.UserMappingOptions;
import edu.java.domain.jooq.information_schema.tables.UserMappings;
import edu.java.domain.jooq.information_schema.tables.ViewColumnUsage;
import edu.java.domain.jooq.information_schema.tables.ViewRoutineUsage;
import edu.java.domain.jooq.information_schema.tables.ViewTableUsage;
import edu.java.domain.jooq.information_schema.tables.Views;
import edu.java.domain.jooq.information_schema.tables._PgExpandarray;
import edu.java.domain.jooq.information_schema.tables._PgForeignDataWrappers;
import edu.java.domain.jooq.information_schema.tables._PgForeignServers;
import edu.java.domain.jooq.information_schema.tables._PgForeignTableColumns;
import edu.java.domain.jooq.information_schema.tables._PgForeignTables;
import edu.java.domain.jooq.information_schema.tables._PgUserMappings;
import edu.java.domain.jooq.information_schema.tables.records._PgExpandarrayRecord;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables {

    public static final _PgExpandarray _PG_EXPANDARRAY = _PgExpandarray._PG_EXPANDARRAY;

    public static Result<_PgExpandarrayRecord> _PG_EXPANDARRAY(
          Configuration configuration
        , Object[] __1
    ) {
        return configuration.dsl().selectFrom(edu.java.domain.jooq.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
              __1
        )).fetch();
    }

    public static _PgExpandarray _PG_EXPANDARRAY(
          Object[] __1
    ) {
        return edu.java.domain.jooq.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
            __1
        );
    }

    public static _PgExpandarray _PG_EXPANDARRAY(
          Field<Object[]> __1
    ) {
        return edu.java.domain.jooq.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
            __1
        );
    }

    public static final _PgForeignDataWrappers _PG_FOREIGN_DATA_WRAPPERS = _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS;

    public static final _PgForeignServers _PG_FOREIGN_SERVERS = _PgForeignServers._PG_FOREIGN_SERVERS;

    public static final _PgForeignTableColumns _PG_FOREIGN_TABLE_COLUMNS = _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS;

    public static final _PgForeignTables _PG_FOREIGN_TABLES = _PgForeignTables._PG_FOREIGN_TABLES;

    public static final _PgUserMappings _PG_USER_MAPPINGS = _PgUserMappings._PG_USER_MAPPINGS;

    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS;

    public static final ApplicableRoles APPLICABLE_ROLES = ApplicableRoles.APPLICABLE_ROLES;

    public static final Attributes ATTRIBUTES = Attributes.ATTRIBUTES;

    public static final CharacterSets CHARACTER_SETS = CharacterSets.CHARACTER_SETS;

    public static final CheckConstraintRoutineUsage CHECK_CONSTRAINT_ROUTINE_USAGE = CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE;

    public static final CheckConstraints CHECK_CONSTRAINTS = CheckConstraints.CHECK_CONSTRAINTS;

    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    public static final Collations COLLATIONS = Collations.COLLATIONS;

    public static final ColumnColumnUsage COLUMN_COLUMN_USAGE = ColumnColumnUsage.COLUMN_COLUMN_USAGE;

    public static final ColumnDomainUsage COLUMN_DOMAIN_USAGE = ColumnDomainUsage.COLUMN_DOMAIN_USAGE;

    public static final ColumnOptions COLUMN_OPTIONS = ColumnOptions.COLUMN_OPTIONS;

    public static final ColumnPrivileges COLUMN_PRIVILEGES = ColumnPrivileges.COLUMN_PRIVILEGES;

    public static final ColumnUdtUsage COLUMN_UDT_USAGE = ColumnUdtUsage.COLUMN_UDT_USAGE;

    public static final Columns COLUMNS = Columns.COLUMNS;

    public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE;

    public static final ConstraintTableUsage CONSTRAINT_TABLE_USAGE = ConstraintTableUsage.CONSTRAINT_TABLE_USAGE;

    public static final DataTypePrivileges DATA_TYPE_PRIVILEGES = DataTypePrivileges.DATA_TYPE_PRIVILEGES;

    public static final DomainConstraints DOMAIN_CONSTRAINTS = DomainConstraints.DOMAIN_CONSTRAINTS;

    public static final DomainUdtUsage DOMAIN_UDT_USAGE = DomainUdtUsage.DOMAIN_UDT_USAGE;

    public static final Domains DOMAINS = Domains.DOMAINS;

    public static final ElementTypes ELEMENT_TYPES = ElementTypes.ELEMENT_TYPES;

    public static final EnabledRoles ENABLED_ROLES = EnabledRoles.ENABLED_ROLES;

    public static final ForeignDataWrapperOptions FOREIGN_DATA_WRAPPER_OPTIONS = ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS;

    public static final ForeignDataWrappers FOREIGN_DATA_WRAPPERS = ForeignDataWrappers.FOREIGN_DATA_WRAPPERS;

    public static final ForeignServerOptions FOREIGN_SERVER_OPTIONS = ForeignServerOptions.FOREIGN_SERVER_OPTIONS;

    public static final ForeignServers FOREIGN_SERVERS = ForeignServers.FOREIGN_SERVERS;

    public static final ForeignTableOptions FOREIGN_TABLE_OPTIONS = ForeignTableOptions.FOREIGN_TABLE_OPTIONS;

    public static final ForeignTables FOREIGN_TABLES = ForeignTables.FOREIGN_TABLES;

    public static final InformationSchemaCatalogName INFORMATION_SCHEMA_CATALOG_NAME = InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME;

    public static final KeyColumnUsage KEY_COLUMN_USAGE = KeyColumnUsage.KEY_COLUMN_USAGE;

    public static final Parameters PARAMETERS = Parameters.PARAMETERS;

    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    public static final RoleColumnGrants ROLE_COLUMN_GRANTS = RoleColumnGrants.ROLE_COLUMN_GRANTS;

    public static final RoleRoutineGrants ROLE_ROUTINE_GRANTS = RoleRoutineGrants.ROLE_ROUTINE_GRANTS;

    public static final RoleTableGrants ROLE_TABLE_GRANTS = RoleTableGrants.ROLE_TABLE_GRANTS;

    public static final RoleUdtGrants ROLE_UDT_GRANTS = RoleUdtGrants.ROLE_UDT_GRANTS;

    public static final RoleUsageGrants ROLE_USAGE_GRANTS = RoleUsageGrants.ROLE_USAGE_GRANTS;

    public static final RoutineColumnUsage ROUTINE_COLUMN_USAGE = RoutineColumnUsage.ROUTINE_COLUMN_USAGE;

    public static final RoutinePrivileges ROUTINE_PRIVILEGES = RoutinePrivileges.ROUTINE_PRIVILEGES;

    public static final RoutineRoutineUsage ROUTINE_ROUTINE_USAGE = RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE;

    public static final RoutineSequenceUsage ROUTINE_SEQUENCE_USAGE = RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE;

    public static final RoutineTableUsage ROUTINE_TABLE_USAGE = RoutineTableUsage.ROUTINE_TABLE_USAGE;

    public static final Routines ROUTINES = Routines.ROUTINES;

    public static final Schemata SCHEMATA = Schemata.SCHEMATA;

    public static final Sequences SEQUENCES = Sequences.SEQUENCES;

    public static final SqlFeatures SQL_FEATURES = SqlFeatures.SQL_FEATURES;

    public static final SqlImplementationInfo SQL_IMPLEMENTATION_INFO = SqlImplementationInfo.SQL_IMPLEMENTATION_INFO;

    public static final SqlParts SQL_PARTS = SqlParts.SQL_PARTS;

    public static final SqlSizing SQL_SIZING = SqlSizing.SQL_SIZING;

    public static final TableConstraints TABLE_CONSTRAINTS = TableConstraints.TABLE_CONSTRAINTS;

    public static final TablePrivileges TABLE_PRIVILEGES = TablePrivileges.TABLE_PRIVILEGES;

    public static final edu.java.domain.jooq.information_schema.tables.Tables TABLES = edu.java.domain.jooq.information_schema.tables.Tables.TABLES;

    public static final Transforms TRANSFORMS = Transforms.TRANSFORMS;

    public static final TriggeredUpdateColumns TRIGGERED_UPDATE_COLUMNS = TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS;

    public static final Triggers TRIGGERS = Triggers.TRIGGERS;

    public static final UdtPrivileges UDT_PRIVILEGES = UdtPrivileges.UDT_PRIVILEGES;

    public static final UsagePrivileges USAGE_PRIVILEGES = UsagePrivileges.USAGE_PRIVILEGES;

    public static final UserDefinedTypes USER_DEFINED_TYPES = UserDefinedTypes.USER_DEFINED_TYPES;

    public static final UserMappingOptions USER_MAPPING_OPTIONS = UserMappingOptions.USER_MAPPING_OPTIONS;

    public static final UserMappings USER_MAPPINGS = UserMappings.USER_MAPPINGS;

    public static final ViewColumnUsage VIEW_COLUMN_USAGE = ViewColumnUsage.VIEW_COLUMN_USAGE;

    public static final ViewRoutineUsage VIEW_ROUTINE_USAGE = ViewRoutineUsage.VIEW_ROUTINE_USAGE;

    public static final ViewTableUsage VIEW_TABLE_USAGE = ViewTableUsage.VIEW_TABLE_USAGE;

    public static final Views VIEWS = Views.VIEWS;
}