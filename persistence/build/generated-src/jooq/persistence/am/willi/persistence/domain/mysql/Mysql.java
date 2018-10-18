/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql;


import am.willi.persistence.domain.DefaultCatalog;
import am.willi.persistence.domain.mysql.tables.ColumnStats;
import am.willi.persistence.domain.mysql.tables.ColumnsPriv;
import am.willi.persistence.domain.mysql.tables.Db;
import am.willi.persistence.domain.mysql.tables.Event;
import am.willi.persistence.domain.mysql.tables.Func;
import am.willi.persistence.domain.mysql.tables.GeneralLog;
import am.willi.persistence.domain.mysql.tables.GtidSlavePos;
import am.willi.persistence.domain.mysql.tables.HelpCategory;
import am.willi.persistence.domain.mysql.tables.HelpKeyword;
import am.willi.persistence.domain.mysql.tables.HelpRelation;
import am.willi.persistence.domain.mysql.tables.HelpTopic;
import am.willi.persistence.domain.mysql.tables.Host;
import am.willi.persistence.domain.mysql.tables.IndexStats;
import am.willi.persistence.domain.mysql.tables.InnodbIndexStats;
import am.willi.persistence.domain.mysql.tables.InnodbTableStats;
import am.willi.persistence.domain.mysql.tables.Plugin;
import am.willi.persistence.domain.mysql.tables.Proc;
import am.willi.persistence.domain.mysql.tables.ProcsPriv;
import am.willi.persistence.domain.mysql.tables.ProxiesPriv;
import am.willi.persistence.domain.mysql.tables.RolesMapping;
import am.willi.persistence.domain.mysql.tables.Servers;
import am.willi.persistence.domain.mysql.tables.SlowLog;
import am.willi.persistence.domain.mysql.tables.TableStats;
import am.willi.persistence.domain.mysql.tables.TablesPriv;
import am.willi.persistence.domain.mysql.tables.TimeZone;
import am.willi.persistence.domain.mysql.tables.TimeZoneLeapSecond;
import am.willi.persistence.domain.mysql.tables.TimeZoneName;
import am.willi.persistence.domain.mysql.tables.TimeZoneTransition;
import am.willi.persistence.domain.mysql.tables.TimeZoneTransitionType;
import am.willi.persistence.domain.mysql.tables.TransactionRegistry;
import am.willi.persistence.domain.mysql.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mysql extends SchemaImpl {

    private static final long serialVersionUID = 503798875;

    /**
     * The reference instance of <code>mysql</code>
     */
    public static final Mysql MYSQL = new Mysql();

    /**
     * Column privileges
     */
    public final ColumnsPriv COLUMNS_PRIV = am.willi.persistence.domain.mysql.tables.ColumnsPriv.COLUMNS_PRIV;

    /**
     * Statistics on Columns
     */
    public final ColumnStats COLUMN_STATS = am.willi.persistence.domain.mysql.tables.ColumnStats.COLUMN_STATS;

    /**
     * Database privileges
     */
    public final Db DB = am.willi.persistence.domain.mysql.tables.Db.DB;

    /**
     * Events
     */
    public final Event EVENT = am.willi.persistence.domain.mysql.tables.Event.EVENT;

    /**
     * User defined functions
     */
    public final Func FUNC = am.willi.persistence.domain.mysql.tables.Func.FUNC;

    /**
     * General log
     */
    public final GeneralLog GENERAL_LOG = am.willi.persistence.domain.mysql.tables.GeneralLog.GENERAL_LOG;

    /**
     * Replication slave GTID position
     */
    public final GtidSlavePos GTID_SLAVE_POS = am.willi.persistence.domain.mysql.tables.GtidSlavePos.GTID_SLAVE_POS;

    /**
     * help categories
     */
    public final HelpCategory HELP_CATEGORY = am.willi.persistence.domain.mysql.tables.HelpCategory.HELP_CATEGORY;

    /**
     * help keywords
     */
    public final HelpKeyword HELP_KEYWORD = am.willi.persistence.domain.mysql.tables.HelpKeyword.HELP_KEYWORD;

    /**
     * keyword-topic relation
     */
    public final HelpRelation HELP_RELATION = am.willi.persistence.domain.mysql.tables.HelpRelation.HELP_RELATION;

    /**
     * help topics
     */
    public final HelpTopic HELP_TOPIC = am.willi.persistence.domain.mysql.tables.HelpTopic.HELP_TOPIC;

    /**
     * Host privileges;  Merged with database privileges
     */
    public final Host HOST = am.willi.persistence.domain.mysql.tables.Host.HOST;

    /**
     * Statistics on Indexes
     */
    public final IndexStats INDEX_STATS = am.willi.persistence.domain.mysql.tables.IndexStats.INDEX_STATS;

    /**
     * The table <code>mysql.innodb_index_stats</code>.
     */
    public final InnodbIndexStats INNODB_INDEX_STATS = am.willi.persistence.domain.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS;

    /**
     * The table <code>mysql.innodb_table_stats</code>.
     */
    public final InnodbTableStats INNODB_TABLE_STATS = am.willi.persistence.domain.mysql.tables.InnodbTableStats.INNODB_TABLE_STATS;

    /**
     * MySQL plugins
     */
    public final Plugin PLUGIN = am.willi.persistence.domain.mysql.tables.Plugin.PLUGIN;

    /**
     * Stored Procedures
     */
    public final Proc PROC = am.willi.persistence.domain.mysql.tables.Proc.PROC;

    /**
     * Procedure privileges
     */
    public final ProcsPriv PROCS_PRIV = am.willi.persistence.domain.mysql.tables.ProcsPriv.PROCS_PRIV;

    /**
     * User proxy privileges
     */
    public final ProxiesPriv PROXIES_PRIV = am.willi.persistence.domain.mysql.tables.ProxiesPriv.PROXIES_PRIV;

    /**
     * Granted roles
     */
    public final RolesMapping ROLES_MAPPING = am.willi.persistence.domain.mysql.tables.RolesMapping.ROLES_MAPPING;

    /**
     * MySQL Foreign Servers table
     */
    public final Servers SERVERS = am.willi.persistence.domain.mysql.tables.Servers.SERVERS;

    /**
     * Slow log
     */
    public final SlowLog SLOW_LOG = am.willi.persistence.domain.mysql.tables.SlowLog.SLOW_LOG;

    /**
     * Table privileges
     */
    public final TablesPriv TABLES_PRIV = am.willi.persistence.domain.mysql.tables.TablesPriv.TABLES_PRIV;

    /**
     * Statistics on Tables
     */
    public final TableStats TABLE_STATS = am.willi.persistence.domain.mysql.tables.TableStats.TABLE_STATS;

    /**
     * Time zones
     */
    public final TimeZone TIME_ZONE = am.willi.persistence.domain.mysql.tables.TimeZone.TIME_ZONE;

    /**
     * Leap seconds information for time zones
     */
    public final TimeZoneLeapSecond TIME_ZONE_LEAP_SECOND = am.willi.persistence.domain.mysql.tables.TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND;

    /**
     * Time zone names
     */
    public final TimeZoneName TIME_ZONE_NAME = am.willi.persistence.domain.mysql.tables.TimeZoneName.TIME_ZONE_NAME;

    /**
     * Time zone transitions
     */
    public final TimeZoneTransition TIME_ZONE_TRANSITION = am.willi.persistence.domain.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION;

    /**
     * Time zone transition types
     */
    public final TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = am.willi.persistence.domain.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE;

    /**
     * The table <code>mysql.transaction_registry</code>.
     */
    public final TransactionRegistry TRANSACTION_REGISTRY = am.willi.persistence.domain.mysql.tables.TransactionRegistry.TRANSACTION_REGISTRY;

    /**
     * Users and global privileges
     */
    public final User USER = am.willi.persistence.domain.mysql.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Mysql() {
        super("mysql", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ColumnsPriv.COLUMNS_PRIV,
            ColumnStats.COLUMN_STATS,
            Db.DB,
            Event.EVENT,
            Func.FUNC,
            GeneralLog.GENERAL_LOG,
            GtidSlavePos.GTID_SLAVE_POS,
            HelpCategory.HELP_CATEGORY,
            HelpKeyword.HELP_KEYWORD,
            HelpRelation.HELP_RELATION,
            HelpTopic.HELP_TOPIC,
            Host.HOST,
            IndexStats.INDEX_STATS,
            InnodbIndexStats.INNODB_INDEX_STATS,
            InnodbTableStats.INNODB_TABLE_STATS,
            Plugin.PLUGIN,
            Proc.PROC,
            ProcsPriv.PROCS_PRIV,
            ProxiesPriv.PROXIES_PRIV,
            RolesMapping.ROLES_MAPPING,
            Servers.SERVERS,
            SlowLog.SLOW_LOG,
            TablesPriv.TABLES_PRIV,
            TableStats.TABLE_STATS,
            TimeZone.TIME_ZONE,
            TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND,
            TimeZoneName.TIME_ZONE_NAME,
            TimeZoneTransition.TIME_ZONE_TRANSITION,
            TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE,
            TransactionRegistry.TRANSACTION_REGISTRY,
            User.USER);
    }
}