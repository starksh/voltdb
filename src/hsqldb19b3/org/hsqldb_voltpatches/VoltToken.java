/* This file is part of VoltDB.
 * Copyright (C) 2008-2015 VoltDB Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with VoltDB.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.hsqldb_voltpatches;

import java.util.HashMap;
import java.util.Map;

public class VoltToken {

    private final Token m_hsqlToken;
    private final Kind m_kind;

    public String toString() {
        return m_kind.name() + "[" + m_hsqlToken.tokenString + "]";
    }

    public String toSqlText() {
        return m_hsqlToken.getSQL();
    }

    public Kind kind() {
        return m_kind;
    }

    // package visible constructor
    VoltToken(Token hsqlToken) {
        m_hsqlToken = hsqlToken;
        m_kind = Kind.fromHsqlTokenType(hsqlToken.tokenType);
    }

    static public enum Kind {
        A (Tokens.A),
        ABS (Tokens.ABS),
        ABSOLUTE (Tokens.ABSOLUTE),
        ACOS (Tokens.ACOS),
        ACTION (Tokens.ACTION),
        ADA (Tokens.ADA),
        ADD (Tokens.ADD),
        ADMIN (Tokens.ADMIN),
        AFTER (Tokens.AFTER),
        ALIAS (Tokens.ALIAS),
        ALL (Tokens.ALL),
        ALLOCATE (Tokens.ALLOCATE),
        ALTER (Tokens.ALTER),
        ALWAYS (Tokens.ALWAYS),
        AND (Tokens.AND),
        ANY (Tokens.ANY),
        ARE (Tokens.ARE),
        ARRAY (Tokens.ARRAY),
        AS (Tokens.AS),
        ASC (Tokens.ASC),
        ASCII (Tokens.ASCII),
        ASENSITIVE (Tokens.ASENSITIVE),
        ASIN (Tokens.ASIN),
        ASSERTION (Tokens.ASSERTION),
        ASSIGNMENT (Tokens.ASSIGNMENT),
        ASSUMEUNIQUE (Tokens.ASSUMEUNIQUE),
        ASTERISK (Tokens.ASTERISK),
        ASYMMETRIC (Tokens.ASYMMETRIC),
        AT (Tokens.AT),
        ATAN (Tokens.ATAN),
        ATAN2 (Tokens.ATAN2),
        ATOMIC (Tokens.ATOMIC),
        ATTRIBUTE (Tokens.ATTRIBUTE),
        ATTRIBUTES (Tokens.ATTRIBUTES),
        AUTHORIZATION (Tokens.AUTHORIZATION),
        AUTOCOMMIT (Tokens.AUTOCOMMIT),
        AVG (Tokens.AVG),
        BACKUP (Tokens.BACKUP),
        BEFORE (Tokens.BEFORE),
        BEGIN (Tokens.BEGIN),
        BERNOULLI (Tokens.BERNOULLI),
        BETWEEN (Tokens.BETWEEN),
        BIGINT (Tokens.BIGINT),
        BINARY (Tokens.BINARY),
        BIT (Tokens.BIT),
        BITAND (Tokens.BITAND),
        BITLENGTH (Tokens.BITLENGTH),
        BITOR (Tokens.BITOR),
        BITXOR (Tokens.BITXOR),
        BIT_LENGTH (Tokens.BIT_LENGTH),
        BLOB (Tokens.BLOB),
        BLOCKING (Tokens.BLOCKING),
        BOOLEAN (Tokens.BOOLEAN),
        BOTH (Tokens.BOTH),
        BREADTH (Tokens.BREADTH),
        BY (Tokens.BY),
        BYTES (Tokens.BYTES),
        C (Tokens.C),
        CACHE (Tokens.CACHE),
        CACHED (Tokens.CACHED),
        CALL (Tokens.CALL),
        CALLED (Tokens.CALLED),
        CARDINALITY (Tokens.CARDINALITY),
        CASCADE (Tokens.CASCADE),
        CASCADED (Tokens.CASCADED),
        CASE (Tokens.CASE),
        CASEWHEN (Tokens.CASEWHEN),
        CAST (Tokens.CAST),
        CATALOG (Tokens.CATALOG),
        CATALOG_NAME (Tokens.CATALOG_NAME),
        CEIL (Tokens.CEIL),
        CEILING (Tokens.CEILING),
        CHAIN (Tokens.CHAIN),
        CHAR (Tokens.CHAR),
        CHARACTER (Tokens.CHARACTER),
        CHARACTERISTICS (Tokens.CHARACTERISTICS),
        CHARACTERS (Tokens.CHARACTERS),
        CHARACTER_LENGTH (Tokens.CHARACTER_LENGTH),
        CHARACTER_SET_CATALOG (Tokens.CHARACTER_SET_CATALOG),
        CHARACTER_SET_NAME (Tokens.CHARACTER_SET_NAME),
        CHARACTER_SET_SCHEMA (Tokens.CHARACTER_SET_SCHEMA),
        CHAR_LENGTH (Tokens.CHAR_LENGTH),
        CHECK (Tokens.CHECK),
        CHECKPOINT (Tokens.CHECKPOINT),
        CLASS_ORIGIN (Tokens.CLASS_ORIGIN),
        CLOB (Tokens.CLOB),
        CLOSE (Tokens.CLOSE),
        CLOSEBRACKET (Tokens.CLOSEBRACKET),
        COALESCE (Tokens.COALESCE),
        COBOL (Tokens.COBOL),
        COLLATE (Tokens.COLLATE),
        COLLATION (Tokens.COLLATION),
        COLLATION_CATALOG (Tokens.COLLATION_CATALOG),
        COLLATION_NAME (Tokens.COLLATION_NAME),
        COLLATION_SCHEMA (Tokens.COLLATION_SCHEMA),
        COLLECT (Tokens.COLLECT),
        COLON (Tokens.COLON),
        COLUMN (Tokens.COLUMN),
        COLUMN_NAME (Tokens.COLUMN_NAME),
        COMMA (Tokens.COMMA),
        COMMAND_FUNCTION (Tokens.COMMAND_FUNCTION),
        COMMAND_FUNCTION_CODE (Tokens.COMMAND_FUNCTION_CODE),
        COMMIT (Tokens.COMMIT),
        COMMITTED (Tokens.COMMITTED),
        COMPACT (Tokens.COMPACT),
        COMPARABLE (Tokens.COMPARABLE),
        COMPRESSED (Tokens.COMPRESSED),
        CONCAT (Tokens.CONCAT),
        CONCAT_WORD (Tokens.CONCAT_WORD),
        CONDITION (Tokens.CONDITION),
        CONDITION_IDENTIFIER (Tokens.CONDITION_IDENTIFIER),
        CONDITION_NUMBER (Tokens.CONDITION_NUMBER),
        CONNECT (Tokens.CONNECT),
        CONNECTION (Tokens.CONNECTION),
        CONNECTION_NAME (Tokens.CONNECTION_NAME),
        CONSTRAINT (Tokens.CONSTRAINT),
        CONSTRAINTS (Tokens.CONSTRAINTS),
        CONSTRAINT_CATALOG (Tokens.CONSTRAINT_CATALOG),
        CONSTRAINT_NAME (Tokens.CONSTRAINT_NAME),
        CONSTRAINT_SCHEMA (Tokens.CONSTRAINT_SCHEMA),
        CONSTRUCTOR (Tokens.CONSTRUCTOR),
        CONTAINS (Tokens.CONTAINS),
        CONTINUE (Tokens.CONTINUE),
        CONTROL (Tokens.CONTROL),
        CONVERT (Tokens.CONVERT),
        CORR (Tokens.CORR),
        CORRESPONDING (Tokens.CORRESPONDING),
        COS (Tokens.COS),
        COT (Tokens.COT),
        COUNT (Tokens.COUNT),
        COVAR_POP (Tokens.COVAR_POP),
        COVAR_SAMP (Tokens.COVAR_SAMP),
        CREATE (Tokens.CREATE),
        CROSS (Tokens.CROSS),
        CUBE (Tokens.CUBE),
        CUME_DIST (Tokens.CUME_DIST),
        CURDATE (Tokens.CURDATE),
        CURRENT (Tokens.CURRENT),
        CURRENT_CATALOG (Tokens.CURRENT_CATALOG),
        CURRENT_DATE (Tokens.CURRENT_DATE),
        CURRENT_DEFAULT_TRANSFORM_GROUP (Tokens.CURRENT_DEFAULT_TRANSFORM_GROUP),
        CURRENT_PATH (Tokens.CURRENT_PATH),
        CURRENT_ROLE (Tokens.CURRENT_ROLE),
        CURRENT_SCHEMA (Tokens.CURRENT_SCHEMA),
        CURRENT_TIME (Tokens.CURRENT_TIME),
        CURRENT_TIMESTAMP (Tokens.CURRENT_TIMESTAMP),
        CURRENT_TRANSFORM_GROUP_FOR_TYPE (Tokens.CURRENT_TRANSFORM_GROUP_FOR_TYPE),
        CURRENT_USER (Tokens.CURRENT_USER),
        CURSOR (Tokens.CURSOR),
        CURSOR_NAME (Tokens.CURSOR_NAME),
        CURTIME (Tokens.CURTIME),
        CYCLE (Tokens.CYCLE),
        DATA (Tokens.DATA),
        DATABASE (Tokens.DATABASE),
        DATE (Tokens.DATE),
        DATEDIFF (Tokens.DATEDIFF),
        DATETIME_INTERVAL_CODE (Tokens.DATETIME_INTERVAL_CODE),
        DATETIME_INTERVAL_PRECISION (Tokens.DATETIME_INTERVAL_PRECISION),
        DAY (Tokens.DAY),
        DAYNAME (Tokens.DAYNAME),
        DAYOFMONTH (Tokens.DAYOFMONTH),
        DAYOFWEEK (Tokens.DAYOFWEEK),
        DAYOFYEAR (Tokens.DAYOFYEAR),
        DAY_NAME (Tokens.DAY_NAME),
        DAY_OF_MONTH (Tokens.DAY_OF_MONTH),
        DAY_OF_WEEK (Tokens.DAY_OF_WEEK),
        DAY_OF_YEAR (Tokens.DAY_OF_YEAR),
        DEALLOCATE (Tokens.DEALLOCATE),
        DEC (Tokens.DEC),
        DECIMAL (Tokens.DECIMAL),
        DECLARE (Tokens.DECLARE),
        DEFAULT (Tokens.DEFAULT),
        DEFAULTS (Tokens.DEFAULTS),
        DEFERRABLE (Tokens.DEFERRABLE),
        DEFERRED (Tokens.DEFERRED),
        DEFINED (Tokens.DEFINED),
        DEFINER (Tokens.DEFINER),
        DEFRAG (Tokens.DEFRAG),
        DEGREE (Tokens.DEGREE),
        DEGREES (Tokens.DEGREES),
        DELETE (Tokens.DELETE),
        DENSE_RANK (Tokens.DENSE_RANK),
        DEPTH (Tokens.DEPTH),
        DEREF (Tokens.DEREF),
        DERIVED (Tokens.DERIVED),
        DESC (Tokens.DESC),
        DESCRIBE (Tokens.DESCRIBE),
        DESCRIPTOR (Tokens.DESCRIPTOR),
        DETERMINISTIC (Tokens.DETERMINISTIC),
        DIAGNOSTICS (Tokens.DIAGNOSTICS),
        DIFFERENCE (Tokens.DIFFERENCE),
        DISCONNECT (Tokens.DISCONNECT),
        DISPATCH (Tokens.DISPATCH),
        DISTINCT (Tokens.DISTINCT),
        DIVIDE (Tokens.DIVIDE),
        DMOD (Tokens.DMOD),
        DO (Tokens.DO),
        DOMAIN (Tokens.DOMAIN),
        DOUBLE (Tokens.DOUBLE),
        DOUBLE_COLON (Tokens.DOUBLE_COLON),
        DOUBLE_COLON_OP (Tokens.DOUBLE_COLON_OP),
        DOUBLE_COLUMN_OP (Tokens.DOUBLE_COLUMN_OP),
        DOUBLE_PERIOD_OP (Tokens.DOUBLE_PERIOD_OP),
        DROP (Tokens.DROP),
        DYNAMIC (Tokens.DYNAMIC),
        DYNAMIC_FUNCTION (Tokens.DYNAMIC_FUNCTION),
        DYNAMIC_FUNCTION_CODE (Tokens.DYNAMIC_FUNCTION_CODE),
        EACH (Tokens.EACH),
        ELEMENT (Tokens.ELEMENT),
        ELSE (Tokens.ELSE),
        ELSEIF (Tokens.ELSEIF),
        END (Tokens.END),
        END_EXEC (Tokens.END_EXEC),
        EQUALS (Tokens.EQUALS),
        ESCAPE (Tokens.ESCAPE),
        EVENT (Tokens.EVENT),
        EVERY (Tokens.EVERY),
        EXCEPT (Tokens.EXCEPT),
        EXCEPTION (Tokens.EXCEPTION),
        EXCLUDE (Tokens.EXCLUDE),
        EXCLUDING (Tokens.EXCLUDING),
        EXEC (Tokens.EXEC),
        EXECUTE (Tokens.EXECUTE),
        EXISTS (Tokens.EXISTS),
        EXIT (Tokens.EXIT),
        EXP (Tokens.EXP),
        EXPLAIN (Tokens.EXPLAIN),
        EXTERNAL (Tokens.EXTERNAL),
        EXTRACT (Tokens.EXTRACT),
        FALSE (Tokens.FALSE),
        FETCH (Tokens.FETCH),
        FILE (Tokens.FILE),
        FILES (Tokens.FILES),
        FILTER (Tokens.FILTER),
        FINAL (Tokens.FINAL),
        FIRST (Tokens.FIRST),
        FIRST_VALUE (Tokens.FIRST_VALUE),
        FLOAT (Tokens.FLOAT),
        FLOOR (Tokens.FLOOR),
        FOLLOWING (Tokens.FOLLOWING),
        FOR (Tokens.FOR),
        FOREIGN (Tokens.FOREIGN),
        FORTRAN (Tokens.FORTRAN),
        FOUND (Tokens.FOUND),
        FREE (Tokens.FREE),
        FROM (Tokens.FROM),
        FULL (Tokens.FULL),
        FUNCTION (Tokens.FUNCTION),
        FUSION (Tokens.FUSION),
        G (Tokens.G),
        GENERAL (Tokens.GENERAL),
        GENERATED (Tokens.GENERATED),
        GET (Tokens.GET),
        GLOBAL (Tokens.GLOBAL),
        GO (Tokens.GO),
        GOTO (Tokens.GOTO),
        GRANT (Tokens.GRANT),
        GRANTED (Tokens.GRANTED),
        GREATER (Tokens.GREATER),
        GREATER_EQUALS (Tokens.GREATER_EQUALS),
        GROUP (Tokens.GROUP),
        GROUPING (Tokens.GROUPING),
        HANDLER (Tokens.HANDLER),
        HAVING (Tokens.HAVING),
        HEADER (Tokens.HEADER),
        HEXTORAW (Tokens.HEXTORAW),
        HIERARCHY (Tokens.HIERARCHY),
        HOLD (Tokens.HOLD),
        HOUR (Tokens.HOUR),
        IDENTITY (Tokens.IDENTITY),
        IF (Tokens.IF),
        IFNULL (Tokens.IFNULL),
        IGNORE (Tokens.IGNORE),
        IGNORECASE (Tokens.IGNORECASE),
        IMMEDIATE (Tokens.IMMEDIATE),
        IMMEDIATELY (Tokens.IMMEDIATELY),
        IMPLEMENTATION (Tokens.IMPLEMENTATION),
        IN (Tokens.IN),
        INCLUDING (Tokens.INCLUDING),
        INCREMENT (Tokens.INCREMENT),
        INDEX (Tokens.INDEX),
        INDICATOR (Tokens.INDICATOR),
        INITIAL (Tokens.INITIAL),
        INITIALLY (Tokens.INITIALLY),
        INNER (Tokens.INNER),
        INOUT (Tokens.INOUT),
        INPUT (Tokens.INPUT),
        INSENSITIVE (Tokens.INSENSITIVE),
        INSERT (Tokens.INSERT),
        INSTANCE (Tokens.INSTANCE),
        INSTANTIABLE (Tokens.INSTANTIABLE),
        INSTEAD (Tokens.INSTEAD),
        INT (Tokens.INT),
        INTEGER (Tokens.INTEGER),
        INTERSECT (Tokens.INTERSECT),
        INTERSECTION (Tokens.INTERSECTION),
        INTERVAL (Tokens.INTERVAL),
        INTO (Tokens.INTO),
        INVOKER (Tokens.INVOKER),
        IS (Tokens.IS),
        ISAUTOCOMMIT (Tokens.ISAUTOCOMMIT),
        ISOLATION (Tokens.ISOLATION),
        ISREADONLYDATABASE (Tokens.ISREADONLYDATABASE),
        ISREADONLYDATABASEFILES (Tokens.ISREADONLYDATABASEFILES),
        ISREADONLYSESSION (Tokens.ISREADONLYSESSION),
        ITERATE (Tokens.ITERATE),
        JAVA (Tokens.JAVA),
        JOIN (Tokens.JOIN),
        K (Tokens.K),
        KEY (Tokens.KEY),
        KEY_MEMBER (Tokens.KEY_MEMBER),
        KEY_TYPE (Tokens.KEY_TYPE),
        LAG (Tokens.LAG),
        LANGUAGE (Tokens.LANGUAGE),
        LARGE (Tokens.LARGE),
        LAST (Tokens.LAST),
        LAST_VALUE (Tokens.LAST_VALUE),
        LATERAL (Tokens.LATERAL),
        LCASE (Tokens.LCASE),
        LEAD (Tokens.LEAD),
        LEADING (Tokens.LEADING),
        LEAVE (Tokens.LEAVE),
        LEFT (Tokens.LEFT),
        LENGTH (Tokens.LENGTH),
        LESS (Tokens.LESS),
        LESS_EQUALS (Tokens.LESS_EQUALS),
        LEVEL (Tokens.LEVEL),
        LIKE (Tokens.LIKE),
        LIKE_REGEX (Tokens.LIKE_REGEX),
        LIMIT (Tokens.LIMIT),
        LN (Tokens.LN),
        LOCAL (Tokens.LOCAL),
        LOCALTIME (Tokens.LOCALTIME),
        LOCALTIMESTAMP (Tokens.LOCALTIMESTAMP),
        LOCATE (Tokens.LOCATE),
        LOCATOR (Tokens.LOCATOR),
        LOCK (Tokens.LOCK),
        LOCKS (Tokens.LOCKS),
        LOG (Tokens.LOG),
        LOG10 (Tokens.LOG10),
        LOGSIZE (Tokens.LOGSIZE),
        LOOP (Tokens.LOOP),
        LOWER (Tokens.LOWER),
        LTRIM (Tokens.LTRIM),
        M (Tokens.M),
        MAP (Tokens.MAP),
        MATCH (Tokens.MATCH),
        MATCHED (Tokens.MATCHED),
        MAX (Tokens.MAX),
        MAXROWS (Tokens.MAXROWS),
        MAXVALUE (Tokens.MAXVALUE),
        MAX_CARDINALITY (Tokens.MAX_CARDINALITY),
        MEMBER (Tokens.MEMBER),
        MEMORY (Tokens.MEMORY),
        MERGE (Tokens.MERGE),
        MESSAGE_LENGTH (Tokens.MESSAGE_LENGTH),
        MESSAGE_OCTET_LENGTH (Tokens.MESSAGE_OCTET_LENGTH),
        MESSAGE_TEXT (Tokens.MESSAGE_TEXT),
        METHOD (Tokens.METHOD),
        MICROS (Tokens.MICROS),
        MICROSECOND (Tokens.MICROSECOND),
        MILLIS (Tokens.MILLIS),
        MILLISECOND (Tokens.MILLISECOND),
        MIN (Tokens.MIN),
        MINUS (Tokens.MINUS),
        MINUS_EXCEPT (Tokens.MINUS_EXCEPT),
        MINUTE (Tokens.MINUTE),
        MINVALUE (Tokens.MINVALUE),
        MOD (Tokens.MOD),
        MODIFIES (Tokens.MODIFIES),
        MODULE (Tokens.MODULE),
        MONTH (Tokens.MONTH),
        MONTH_NAME (Tokens.MONTH_NAME),
        MORE (Tokens.MORE),
        MULTISET (Tokens.MULTISET),
        MUMPS (Tokens.MUMPS),
        MVCC (Tokens.MVCC),
        NAME (Tokens.NAME),
        NAMES (Tokens.NAMES),
        NATIONAL (Tokens.NATIONAL),
        NATURAL (Tokens.NATURAL),
        NCHAR (Tokens.NCHAR),
        NCLOB (Tokens.NCLOB),
        NESTING (Tokens.NESTING),
        NEW (Tokens.NEW),
        NEXT (Tokens.NEXT),
        NIO (Tokens.NIO),
        NO (Tokens.NO),
        NONE (Tokens.NONE),
        NONTHNAME (Tokens.NONTHNAME),
        NORMALIZE (Tokens.NORMALIZE),
        NORMALIZED (Tokens.NORMALIZED),
        NOT (Tokens.NOT),
        NOT_EQUALS (Tokens.NOT_EQUALS),
        NOW (Tokens.NOW),
        NTH_VALUE (Tokens.NTH_VALUE),
        NTILE (Tokens.NTILE),
        NULL (Tokens.NULL),
        NULLABLE (Tokens.NULLABLE),
        NULLIF (Tokens.NULLIF),
        NULLS (Tokens.NULLS),
        NUMBER (Tokens.NUMBER),
        NUMERIC (Tokens.NUMERIC),
        OBJECT (Tokens.OBJECT),
        OCCURRENCES_REGEX (Tokens.OCCURRENCES_REGEX),
        OCTETLENGTH (Tokens.OCTETLENGTH),
        OCTETS (Tokens.OCTETS),
        OCTET_LENGTH (Tokens.OCTET_LENGTH),
        OF (Tokens.OF),
        OFF (Tokens.OFF),
        OFFSET (Tokens.OFFSET),
        OLD (Tokens.OLD),
        ON (Tokens.ON),
        ONLY (Tokens.ONLY),
        OPEN (Tokens.OPEN),
        OPENBRACKET (Tokens.OPENBRACKET),
        OPTION (Tokens.OPTION),
        OPTIONS (Tokens.OPTIONS),
        OR (Tokens.OR),
        ORDER (Tokens.ORDER),
        ORDERING (Tokens.ORDERING),
        ORDINALITY (Tokens.ORDINALITY),
        OTHERS (Tokens.OTHERS),
        OUT (Tokens.OUT),
        OUTER (Tokens.OUTER),
        OUTPUT (Tokens.OUTPUT),
        OVER (Tokens.OVER),
        OVERLAPS (Tokens.OVERLAPS),
        OVERLAY (Tokens.OVERLAY),
        OVERRIDING (Tokens.OVERRIDING),
        P (Tokens.P),
        PAD (Tokens.PAD),
        PARAMETER (Tokens.PARAMETER),
        PARAMETER_MODE (Tokens.PARAMETER_MODE),
        PARAMETER_NAME (Tokens.PARAMETER_NAME),
        PARAMETER_ORDINAL_POSITION (Tokens.PARAMETER_ORDINAL_POSITION),
        PARAMETER_SPECIFIC_CATALOG (Tokens.PARAMETER_SPECIFIC_CATALOG),
        PARAMETER_SPECIFIC_NAME (Tokens.PARAMETER_SPECIFIC_NAME),
        PARAMETER_SPECIFIC_SCHEMA (Tokens.PARAMETER_SPECIFIC_SCHEMA),
        PARTIAL (Tokens.PARTIAL),
        PARTITION (Tokens.PARTITION),
        PASCAL (Tokens.PASCAL),
        PASSWORD (Tokens.PASSWORD),
        PATH (Tokens.PATH),
        PERCENTILE_CONT (Tokens.PERCENTILE_CONT),
        PERCENTILE_DISC (Tokens.PERCENTILE_DISC),
        PERCENT_RANK (Tokens.PERCENT_RANK),
        PI (Tokens.PI),
        PLACING (Tokens.PLACING),
        PLAN (Tokens.PLAN),
        PLI (Tokens.PLI),
        PLUS (Tokens.PLUS),
        POSITION (Tokens.POSITION),
        POSITION_REGEX (Tokens.POSITION_REGEX),
        POWER (Tokens.POWER),
        PRECEDING (Tokens.PRECEDING),
        PRECISION (Tokens.PRECISION),
        PREPARE (Tokens.PREPARE),
        PRESERVE (Tokens.PRESERVE),
        PRIMARY (Tokens.PRIMARY),
        PRIOR (Tokens.PRIOR),
        PRIVILEGES (Tokens.PRIVILEGES),
        PROCEDURE (Tokens.PROCEDURE),
        PROPERTY (Tokens.PROPERTY),
        PUBLIC (Tokens.PUBLIC),
        QUARTER (Tokens.QUARTER),
        QUESTION (Tokens.QUESTION),
        RADIANS (Tokens.RADIANS),
        RAND (Tokens.RAND),
        RANGE (Tokens.RANGE),
        RANK (Tokens.RANK),
        RAWTOHEX (Tokens.RAWTOHEX),
        READ (Tokens.READ),
        READONLY (Tokens.READONLY),
        READS (Tokens.READS),
        REAL (Tokens.REAL),
        RECURSIVE (Tokens.RECURSIVE),
        REF (Tokens.REF),
        REFERENCES (Tokens.REFERENCES),
        REFERENCING (Tokens.REFERENCING),
        REFERENTIAL_INTEGRITY (Tokens.REFERENTIAL_INTEGRITY),
        REGR_AVGX (Tokens.REGR_AVGX),
        REGR_AVGY (Tokens.REGR_AVGY),
        REGR_COUNT (Tokens.REGR_COUNT),
        REGR_INTERCEPT (Tokens.REGR_INTERCEPT),
        REGR_R2 (Tokens.REGR_R2),
        REGR_SLOPE (Tokens.REGR_SLOPE),
        REGR_SXX (Tokens.REGR_SXX),
        REGR_SXY (Tokens.REGR_SXY),
        REGR_SYY (Tokens.REGR_SYY),
        RELATIVE (Tokens.RELATIVE),
        RELEASE (Tokens.RELEASE),
        RENAME (Tokens.RENAME),
        REPEAT (Tokens.REPEAT),
        REPEATABLE (Tokens.REPEATABLE),
        REPLACE (Tokens.REPLACE),
        RESIGNAL (Tokens.RESIGNAL),
        RESPECT (Tokens.RESPECT),
        RESTART (Tokens.RESTART),
        RESTRICT (Tokens.RESTRICT),
        RESULT (Tokens.RESULT),
        RETURN (Tokens.RETURN),
        RETURNED_CARDINALITY (Tokens.RETURNED_CARDINALITY),
        RETURNED_LENGTH (Tokens.RETURNED_LENGTH),
        RETURNED_OCTET_LENGTH (Tokens.RETURNED_OCTET_LENGTH),
        RETURNED_SQLSTATE (Tokens.RETURNED_SQLSTATE),
        RETURNS (Tokens.RETURNS),
        REVOKE (Tokens.REVOKE),
        RIGHT (Tokens.RIGHT),
        RIGHT_ARROW_OP (Tokens.RIGHT_ARROW_OP),
        ROLE (Tokens.ROLE),
        ROLLBACK (Tokens.ROLLBACK),
        ROLLUP (Tokens.ROLLUP),
        ROUND (Tokens.ROUND),
        ROUNDMAGIC (Tokens.ROUNDMAGIC),
        ROUTINE (Tokens.ROUTINE),
        ROUTINE_CATALOG (Tokens.ROUTINE_CATALOG),
        ROUTINE_NAME (Tokens.ROUTINE_NAME),
        ROUTINE_SCHEMA (Tokens.ROUTINE_SCHEMA),
        ROW (Tokens.ROW),
        ROWS (Tokens.ROWS),
        ROW_COUNT (Tokens.ROW_COUNT),
        ROW_NUMBER (Tokens.ROW_NUMBER),
        RTRIM (Tokens.RTRIM),
        SAVEPOINT (Tokens.SAVEPOINT),
        SCALE (Tokens.SCALE),
        SCHEMA (Tokens.SCHEMA),
        SCHEMA_NAME (Tokens.SCHEMA_NAME),
        SCOPE (Tokens.SCOPE),
        SCOPE_CATALOG (Tokens.SCOPE_CATALOG),
        SCOPE_NAME (Tokens.SCOPE_NAME),
        SCOPE_SCHEMA (Tokens.SCOPE_SCHEMA),
        SCRIPT (Tokens.SCRIPT),
        SCRIPTFORMAT (Tokens.SCRIPTFORMAT),
        SCROLL (Tokens.SCROLL),
        SEARCH (Tokens.SEARCH),
        SECOND (Tokens.SECOND),
        SECONDS_MIDNIGHT (Tokens.SECONDS_MIDNIGHT),
        SECTION (Tokens.SECTION),
        SECURITY (Tokens.SECURITY),
        SELECT (Tokens.SELECT),
        SELF (Tokens.SELF),
        SEMICOLON (Tokens.SEMICOLON),
        SENSITIVE (Tokens.SENSITIVE),
        SEQUENCE (Tokens.SEQUENCE),
        SERIALIZABLE (Tokens.SERIALIZABLE),
        SERVER_NAME (Tokens.SERVER_NAME),
        SESSION (Tokens.SESSION),
        SESSION_USER (Tokens.SESSION_USER),
        SET (Tokens.SET),
        SETS (Tokens.SETS),
        SHUTDOWN (Tokens.SHUTDOWN),
        SIGN (Tokens.SIGN),
        SIGNAL (Tokens.SIGNAL),
        SIMILAR (Tokens.SIMILAR),
        SIMPLE (Tokens.SIMPLE),
        SIN (Tokens.SIN),
        SIZE (Tokens.SIZE),
        SMALLINT (Tokens.SMALLINT),
        SOME (Tokens.SOME),
        SOUNDEX (Tokens.SOUNDEX),
        SOURCE (Tokens.SOURCE),
        SPACE (Tokens.SPACE),
        SPACE_WORD (Tokens.SPACE_WORD),
        SPECIFIC (Tokens.SPECIFIC),
        SPECIFICTYPE (Tokens.SPECIFICTYPE),
        SPECIFIC_NAME (Tokens.SPECIFIC_NAME),
        SQL (Tokens.SQL),
        SQLEXCEPTION (Tokens.SQLEXCEPTION),
        SQLSTATE (Tokens.SQLSTATE),
        SQLWARNING (Tokens.SQLWARNING),
        SQL_BIGINT (Tokens.SQL_BIGINT),
        SQL_BINARY (Tokens.SQL_BINARY),
        SQL_BIT (Tokens.SQL_BIT),
        SQL_BLOB (Tokens.SQL_BLOB),
        SQL_BOOLEAN (Tokens.SQL_BOOLEAN),
        SQL_CHAR (Tokens.SQL_CHAR),
        SQL_CLOB (Tokens.SQL_CLOB),
        SQL_DATALINK (Tokens.SQL_DATALINK),
        SQL_DATE (Tokens.SQL_DATE),
        SQL_DECIMAL (Tokens.SQL_DECIMAL),
        SQL_DOUBLE (Tokens.SQL_DOUBLE),
        SQL_FLOAT (Tokens.SQL_FLOAT),
        SQL_INTEGER (Tokens.SQL_INTEGER),
        SQL_LONGNVARCHAR (Tokens.SQL_LONGNVARCHAR),
        SQL_LONGVARBINARY (Tokens.SQL_LONGVARBINARY),
        SQL_LONGVARCHAR (Tokens.SQL_LONGVARCHAR),
        SQL_NCHAR (Tokens.SQL_NCHAR),
        SQL_NCLOB (Tokens.SQL_NCLOB),
        SQL_NUMERIC (Tokens.SQL_NUMERIC),
        SQL_NVARCHAR (Tokens.SQL_NVARCHAR),
        SQL_REAL (Tokens.SQL_REAL),
        SQL_ROWID (Tokens.SQL_ROWID),
        SQL_SMALLINT (Tokens.SQL_SMALLINT),
        SQL_SQLXML (Tokens.SQL_SQLXML),
        SQL_TIME (Tokens.SQL_TIME),
        SQL_TIMESTAMP (Tokens.SQL_TIMESTAMP),
        SQL_TINYINT (Tokens.SQL_TINYINT),
        SQL_TSI_DAY (Tokens.SQL_TSI_DAY),
        SQL_TSI_FRAC_SECOND (Tokens.SQL_TSI_FRAC_SECOND),
        SQL_TSI_HOUR (Tokens.SQL_TSI_HOUR),
        SQL_TSI_MINUTE (Tokens.SQL_TSI_MINUTE),
        SQL_TSI_MONTH (Tokens.SQL_TSI_MONTH),
        SQL_TSI_QUARTER (Tokens.SQL_TSI_QUARTER),
        SQL_TSI_SECOND (Tokens.SQL_TSI_SECOND),
        SQL_TSI_WEEK (Tokens.SQL_TSI_WEEK),
        SQL_TSI_YEAR (Tokens.SQL_TSI_YEAR),
        SQL_VARBINARY (Tokens.SQL_VARBINARY),
        SQL_VARCHAR (Tokens.SQL_VARCHAR),
        SQRT (Tokens.SQRT),
        STACKED (Tokens.STACKED),
        START (Tokens.START),
        STATE (Tokens.STATE),
        STATEMENT (Tokens.STATEMENT),
        STATIC (Tokens.STATIC),
        STDDEV_POP (Tokens.STDDEV_POP),
        STDDEV_SAMP (Tokens.STDDEV_SAMP),
        STRUCTURE (Tokens.STRUCTURE),
        STYLE (Tokens.STYLE),
        SUBCLASS_ORIGIN (Tokens.SUBCLASS_ORIGIN),
        SUBMULTISET (Tokens.SUBMULTISET),
        SUBSTR (Tokens.SUBSTR),
        SUBSTRING (Tokens.SUBSTRING),
        SUBSTRING_REGEX (Tokens.SUBSTRING_REGEX),
        SUM (Tokens.SUM),
        SYMMETRIC (Tokens.SYMMETRIC),
        SYSDATE (Tokens.SYSDATE),
        SYSTEM (Tokens.SYSTEM),
        SYSTEM_USER (Tokens.SYSTEM_USER),
        T (Tokens.T),
        TABLE (Tokens.TABLE),
        TABLESAMPLE (Tokens.TABLESAMPLE),
        TABLE_NAME (Tokens.TABLE_NAME),
        TAN (Tokens.TAN),
        TEMP (Tokens.TEMP),
        TEMPORARY (Tokens.TEMPORARY),
        TEXT (Tokens.TEXT),
        THEN (Tokens.THEN),
        TIES (Tokens.TIES),
        TIME (Tokens.TIME),
        TIMESTAMP (Tokens.TIMESTAMP),
        TIMESTAMPADD (Tokens.TIMESTAMPADD),
        TIMESTAMPDIFF (Tokens.TIMESTAMPDIFF),
        TIMEZONE_HOUR (Tokens.TIMEZONE_HOUR),
        TIMEZONE_MINUTE (Tokens.TIMEZONE_MINUTE),
        TO (Tokens.TO),
        TODAY (Tokens.TODAY),
        TOP (Tokens.TOP),
        TOP_LEVEL_COUNT (Tokens.TOP_LEVEL_COUNT),
        TO_CHAR (Tokens.TO_CHAR),
        TRAILING (Tokens.TRAILING),
        TRANSACTION (Tokens.TRANSACTION),
        TRANSACTIONS_COMMITTED (Tokens.TRANSACTIONS_COMMITTED),
        TRANSACTIONS_ROLLED_BACK (Tokens.TRANSACTIONS_ROLLED_BACK),
        TRANSACTION_ACTIVE (Tokens.TRANSACTION_ACTIVE),
        TRANSFORM (Tokens.TRANSFORM),
        TRANSFORMS (Tokens.TRANSFORMS),
        TRANSLATE (Tokens.TRANSLATE),
        TRANSLATE_REGEX (Tokens.TRANSLATE_REGEX),
        TRANSLATION (Tokens.TRANSLATION),
        TREAT (Tokens.TREAT),
        TRIGGER (Tokens.TRIGGER),
        TRIGGER_CATALOG (Tokens.TRIGGER_CATALOG),
        TRIGGER_NAME (Tokens.TRIGGER_NAME),
        TRIGGER_SCHEMA (Tokens.TRIGGER_SCHEMA),
        TRIM (Tokens.TRIM),
        TRIM_ARRAY (Tokens.TRIM_ARRAY),
        TRUE (Tokens.TRUE),
        TRUNCATE (Tokens.TRUNCATE),
        TYPE (Tokens.TYPE),
        UCASE (Tokens.UCASE),
        UESCAPE (Tokens.UESCAPE),
        UNBOUNDED (Tokens.UNBOUNDED),
        UNCOMMITTED (Tokens.UNCOMMITTED),
        UNDER (Tokens.UNDER),
        UNDO (Tokens.UNDO),
        UNION (Tokens.UNION),
        UNIQUE (Tokens.UNIQUE),
        UNKNOWN (Tokens.UNKNOWN),
        UNNAMED (Tokens.UNNAMED),
        UNNEST (Tokens.UNNEST),
        UNTIL (Tokens.UNTIL),
        UPDATE (Tokens.UPDATE),
        UPPER (Tokens.UPPER),
        USAGE (Tokens.USAGE),
        USER (Tokens.USER),
        USER_DEFINED_TYPE_CATALOG (Tokens.USER_DEFINED_TYPE_CATALOG),
        USER_DEFINED_TYPE_CODE (Tokens.USER_DEFINED_TYPE_CODE),
        USER_DEFINED_TYPE_NAME (Tokens.USER_DEFINED_TYPE_NAME),
        USER_DEFINED_TYPE_SCHEMA (Tokens.USER_DEFINED_TYPE_SCHEMA),
        USING (Tokens.USING),
        VALUE (Tokens.VALUE),
        VALUES (Tokens.VALUES),
        VARBINARY (Tokens.VARBINARY),
        VARCHAR (Tokens.VARCHAR),
        VARYING (Tokens.VARYING),
        VAR_POP (Tokens.VAR_POP),
        VAR_SAMP (Tokens.VAR_SAMP),
        VIEW (Tokens.VIEW),
        WEEK (Tokens.WEEK),
        WEEKDAY (Tokens.WEEKDAY),
        WEEKOFYEAR (Tokens.WEEKOFYEAR),
        WEEK_OF_YEAR (Tokens.WEEK_OF_YEAR),
        WHEN (Tokens.WHEN),
        WHENEVER (Tokens.WHENEVER),
        WHERE (Tokens.WHERE),
        WHILE (Tokens.WHILE),
        WIDTH_BUCKET (Tokens.WIDTH_BUCKET),
        WINDOW (Tokens.WINDOW),
        WITH (Tokens.WITH),
        WITHIN (Tokens.WITHIN),
        WITHOUT (Tokens.WITHOUT),
        WORK (Tokens.WORK),
        WRITE (Tokens.WRITE),
        WRITE_DELAY (Tokens.WRITE_DELAY),
        X_DELIMITED_IDENTIFIER (Tokens.X_DELIMITED_IDENTIFIER),
        X_ENDPARSE (Tokens.X_ENDPARSE),
        X_IDENTIFIER (Tokens.X_IDENTIFIER),
        X_KEYSET (Tokens.X_KEYSET),
        X_LOB_SIZE (Tokens.X_LOB_SIZE),
        X_MALFORMED_BINARY_STRING (Tokens.X_MALFORMED_BINARY_STRING),
        X_MALFORMED_BIT_STRING (Tokens.X_MALFORMED_BIT_STRING),
        X_MALFORMED_COMMENT (Tokens.X_MALFORMED_COMMENT),
        X_MALFORMED_IDENTIFIER (Tokens.X_MALFORMED_IDENTIFIER),
        X_MALFORMED_NUMERIC (Tokens.X_MALFORMED_NUMERIC),
        X_MALFORMED_STRING (Tokens.X_MALFORMED_STRING),
        X_MALFORMED_UNICODE_ESCAPE (Tokens.X_MALFORMED_UNICODE_ESCAPE),
        X_MALFORMED_UNICODE_STRING (Tokens.X_MALFORMED_UNICODE_STRING),
        X_NULL (Tokens.X_NULL),
        X_OPTION (Tokens.X_OPTION),
        X_POS_INTEGER (Tokens.X_POS_INTEGER),
        X_REMARK (Tokens.X_REMARK),
        X_REPEAT (Tokens.X_REPEAT),
        X_STARTPARSE (Tokens.X_STARTPARSE),
        X_UNKNOWN_TOKEN (Tokens.X_UNKNOWN_TOKEN),
        X_VALUE (Tokens.X_VALUE),
        YEAR (Tokens.YEAR),
        ZONE (Tokens.ZONE);

        private final int m_hsqlTokenType;

        Kind(int hsqlTokenType) {
            m_hsqlTokenType = hsqlTokenType;
        }

        int hsqlTokenType() {
            return m_hsqlTokenType;
        }

        private static Map<Integer, Kind> tokenTypeToKind = new HashMap<Integer, Kind>();
        static {
            for (Kind k : Kind.values()) {
                tokenTypeToKind.put(k.m_hsqlTokenType, k);
            }
        }

        static Kind fromHsqlTokenType(int hsqlTokenType) {
            Kind k = tokenTypeToKind.get(hsqlTokenType);
            if (k == null) {
                String msg = "Unknown HSQL token type: "
                    + Tokens.getKeyword(hsqlTokenType)
                    + " (" + hsqlTokenType + ")";
                throw new IllegalArgumentException(msg);
            }
            return k;
        }
    }
}
