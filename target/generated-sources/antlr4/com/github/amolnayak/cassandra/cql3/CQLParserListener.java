// Generated from com\github\amolnayak\cassandra\cql3\CQLParser.g4 by ANTLR 4.8
package com.github.amolnayak.cassandra.cql3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CQLParser}.
 */
public interface CQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(CQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(CQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#cqls}.
	 * @param ctx the parse tree
	 */
	void enterCqls(CQLParser.CqlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#cqls}.
	 * @param ctx the parse tree
	 */
	void exitCqls(CQLParser.CqlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#statementSeparator}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeparator(CQLParser.StatementSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#statementSeparator}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeparator(CQLParser.StatementSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(CQLParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(CQLParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#cql}.
	 * @param ctx the parse tree
	 */
	void enterCql(CQLParser.CqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#cql}.
	 * @param ctx the parse tree
	 */
	void exitCql(CQLParser.CqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(CQLParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(CQLParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#listUsers}.
	 * @param ctx the parse tree
	 */
	void enterListUsers(CQLParser.ListUsersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#listUsers}.
	 * @param ctx the parse tree
	 */
	void exitListUsers(CQLParser.ListUsersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#listRoles}.
	 * @param ctx the parse tree
	 */
	void enterListRoles(CQLParser.ListRolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#listRoles}.
	 * @param ctx the parse tree
	 */
	void exitListRoles(CQLParser.ListRolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#listPermissions}.
	 * @param ctx the parse tree
	 */
	void enterListPermissions(CQLParser.ListPermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#listPermissions}.
	 * @param ctx the parse tree
	 */
	void exitListPermissions(CQLParser.ListPermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(CQLParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(CQLParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#priviledge}.
	 * @param ctx the parse tree
	 */
	void enterPriviledge(CQLParser.PriviledgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#priviledge}.
	 * @param ctx the parse tree
	 */
	void exitPriviledge(CQLParser.PriviledgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(CQLParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(CQLParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(CQLParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(CQLParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(CQLParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(CQLParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createType}.
	 * @param ctx the parse tree
	 */
	void enterCreateType(CQLParser.CreateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createType}.
	 * @param ctx the parse tree
	 */
	void exitCreateType(CQLParser.CreateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#typeMemberColumnList}.
	 * @param ctx the parse tree
	 */
	void enterTypeMemberColumnList(CQLParser.TypeMemberColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#typeMemberColumnList}.
	 * @param ctx the parse tree
	 */
	void exitTypeMemberColumnList(CQLParser.TypeMemberColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(CQLParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(CQLParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaterializedView(CQLParser.CreateMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaterializedView(CQLParser.CreateMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#materializedViewWhere}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedViewWhere(CQLParser.MaterializedViewWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#materializedViewWhere}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedViewWhere(CQLParser.MaterializedViewWhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnNotNullList}.
	 * @param ctx the parse tree
	 */
	void enterColumnNotNullList(CQLParser.ColumnNotNullListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnNotNullList}.
	 * @param ctx the parse tree
	 */
	void exitColumnNotNullList(CQLParser.ColumnNotNullListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnNotNull}.
	 * @param ctx the parse tree
	 */
	void enterColumnNotNull(CQLParser.ColumnNotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnNotNull}.
	 * @param ctx the parse tree
	 */
	void exitColumnNotNull(CQLParser.ColumnNotNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#materializedViewOptions}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedViewOptions(CQLParser.MaterializedViewOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#materializedViewOptions}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedViewOptions(CQLParser.MaterializedViewOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createKeyspace}.
	 * @param ctx the parse tree
	 */
	void enterCreateKeyspace(CQLParser.CreateKeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createKeyspace}.
	 * @param ctx the parse tree
	 */
	void exitCreateKeyspace(CQLParser.CreateKeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(CQLParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(CQLParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(CQLParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(CQLParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(CQLParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(CQLParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#returnMode}.
	 * @param ctx the parse tree
	 */
	void enterReturnMode(CQLParser.ReturnModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#returnMode}.
	 * @param ctx the parse tree
	 */
	void exitReturnMode(CQLParser.ReturnModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createAggregate}.
	 * @param ctx the parse tree
	 */
	void enterCreateAggregate(CQLParser.CreateAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createAggregate}.
	 * @param ctx the parse tree
	 */
	void exitCreateAggregate(CQLParser.CreateAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInitCondDefinition(CQLParser.InitCondDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInitCondDefinition(CQLParser.InitCondDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondHash}.
	 * @param ctx the parse tree
	 */
	void enterInitCondHash(CQLParser.InitCondHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondHash}.
	 * @param ctx the parse tree
	 */
	void exitInitCondHash(CQLParser.InitCondHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondHashItem}.
	 * @param ctx the parse tree
	 */
	void enterInitCondHashItem(CQLParser.InitCondHashItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondHashItem}.
	 * @param ctx the parse tree
	 */
	void exitInitCondHashItem(CQLParser.InitCondHashItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondListNested}.
	 * @param ctx the parse tree
	 */
	void enterInitCondListNested(CQLParser.InitCondListNestedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondListNested}.
	 * @param ctx the parse tree
	 */
	void exitInitCondListNested(CQLParser.InitCondListNestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondList}.
	 * @param ctx the parse tree
	 */
	void enterInitCondList(CQLParser.InitCondListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondList}.
	 * @param ctx the parse tree
	 */
	void exitInitCondList(CQLParser.InitCondListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#orReplace}.
	 * @param ctx the parse tree
	 */
	void enterOrReplace(CQLParser.OrReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#orReplace}.
	 * @param ctx the parse tree
	 */
	void exitOrReplace(CQLParser.OrReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(CQLParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(CQLParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#userPassword}.
	 * @param ctx the parse tree
	 */
	void enterUserPassword(CQLParser.UserPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#userPassword}.
	 * @param ctx the parse tree
	 */
	void exitUserPassword(CQLParser.UserPasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#userSuperUser}.
	 * @param ctx the parse tree
	 */
	void enterUserSuperUser(CQLParser.UserSuperUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#userSuperUser}.
	 * @param ctx the parse tree
	 */
	void exitUserSuperUser(CQLParser.UserSuperUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterType}.
	 * @param ctx the parse tree
	 */
	void enterAlterType(CQLParser.AlterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterType}.
	 * @param ctx the parse tree
	 */
	void exitAlterType(CQLParser.AlterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeOperation(CQLParser.AlterTypeOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeOperation(CQLParser.AlterTypeOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeRename}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeRename(CQLParser.AlterTypeRenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeRename}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeRename(CQLParser.AlterTypeRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeRenameList}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeRenameList(CQLParser.AlterTypeRenameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeRenameList}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeRenameList(CQLParser.AlterTypeRenameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeRenameItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeRenameItem(CQLParser.AlterTypeRenameItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeRenameItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeRenameItem(CQLParser.AlterTypeRenameItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeAdd}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeAdd(CQLParser.AlterTypeAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeAdd}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeAdd(CQLParser.AlterTypeAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeAlterType}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeAlterType(CQLParser.AlterTypeAlterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeAlterType}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeAlterType(CQLParser.AlterTypeAlterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(CQLParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(CQLParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableOperation(CQLParser.AlterTableOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableOperation(CQLParser.AlterTableOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableWith}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableWith(CQLParser.AlterTableWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableWith}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableWith(CQLParser.AlterTableWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableRename}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableRename(CQLParser.AlterTableRenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableRename}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableRename(CQLParser.AlterTableRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableDropCompactStorage}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropCompactStorage(CQLParser.AlterTableDropCompactStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableDropCompactStorage}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropCompactStorage(CQLParser.AlterTableDropCompactStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableDropColumns}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropColumns(CQLParser.AlterTableDropColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableDropColumns}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropColumns(CQLParser.AlterTableDropColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableDropColumnList}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropColumnList(CQLParser.AlterTableDropColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableDropColumnList}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropColumnList(CQLParser.AlterTableDropColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableAdd}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAdd(CQLParser.AlterTableAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableAdd}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAdd(CQLParser.AlterTableAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableColumnDefinition(CQLParser.AlterTableColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableColumnDefinition(CQLParser.AlterTableColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterRole(CQLParser.AlterRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterRole(CQLParser.AlterRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#roleWith}.
	 * @param ctx the parse tree
	 */
	void enterRoleWith(CQLParser.RoleWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#roleWith}.
	 * @param ctx the parse tree
	 */
	void exitRoleWith(CQLParser.RoleWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#roleWithOptions}.
	 * @param ctx the parse tree
	 */
	void enterRoleWithOptions(CQLParser.RoleWithOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#roleWithOptions}.
	 * @param ctx the parse tree
	 */
	void exitRoleWithOptions(CQLParser.RoleWithOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaterializedView(CQLParser.AlterMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaterializedView(CQLParser.AlterMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(CQLParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(CQLParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropType}.
	 * @param ctx the parse tree
	 */
	void enterDropType(CQLParser.DropTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropType}.
	 * @param ctx the parse tree
	 */
	void exitDropType(CQLParser.DropTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterDropMaterializedView(CQLParser.DropMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitDropMaterializedView(CQLParser.DropMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropAggregate}.
	 * @param ctx the parse tree
	 */
	void enterDropAggregate(CQLParser.DropAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropAggregate}.
	 * @param ctx the parse tree
	 */
	void exitDropAggregate(CQLParser.DropAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(CQLParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(CQLParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(CQLParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(CQLParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(CQLParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(CQLParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(CQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(CQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropKeyspace}.
	 * @param ctx the parse tree
	 */
	void enterDropKeyspace(CQLParser.DropKeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropKeyspace}.
	 * @param ctx the parse tree
	 */
	void exitDropKeyspace(CQLParser.DropKeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(CQLParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(CQLParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(CQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(CQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#withElement}.
	 * @param ctx the parse tree
	 */
	void enterWithElement(CQLParser.WithElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#withElement}.
	 * @param ctx the parse tree
	 */
	void exitWithElement(CQLParser.WithElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#clusteringOrder}.
	 * @param ctx the parse tree
	 */
	void enterClusteringOrder(CQLParser.ClusteringOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#clusteringOrder}.
	 * @param ctx the parse tree
	 */
	void exitClusteringOrder(CQLParser.ClusteringOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(CQLParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(CQLParser.TableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableOptionItem}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionItem(CQLParser.TableOptionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableOptionItem}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionItem(CQLParser.TableOptionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableOptionName}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionName(CQLParser.TableOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableOptionName}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionName(CQLParser.TableOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableOptionValue}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionValue(CQLParser.TableOptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableOptionValue}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionValue(CQLParser.TableOptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#optionHash}.
	 * @param ctx the parse tree
	 */
	void enterOptionHash(CQLParser.OptionHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#optionHash}.
	 * @param ctx the parse tree
	 */
	void exitOptionHash(CQLParser.OptionHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#optionHashItem}.
	 * @param ctx the parse tree
	 */
	void enterOptionHashItem(CQLParser.OptionHashItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#optionHashItem}.
	 * @param ctx the parse tree
	 */
	void exitOptionHashItem(CQLParser.OptionHashItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#optionHashKey}.
	 * @param ctx the parse tree
	 */
	void enterOptionHashKey(CQLParser.OptionHashKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#optionHashKey}.
	 * @param ctx the parse tree
	 */
	void exitOptionHashKey(CQLParser.OptionHashKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#optionHashValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionHashValue(CQLParser.OptionHashValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#optionHashValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionHashValue(CQLParser.OptionHashValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinitionList(CQLParser.ColumnDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinitionList(CQLParser.ColumnDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(CQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(CQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#primaryKeyColumn}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumn(CQLParser.PrimaryKeyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#primaryKeyColumn}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumn(CQLParser.PrimaryKeyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#primaryKeyElement}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyElement(CQLParser.PrimaryKeyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#primaryKeyElement}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyElement(CQLParser.PrimaryKeyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyDefinition(CQLParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyDefinition(CQLParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#singlePrimaryKey}.
	 * @param ctx the parse tree
	 */
	void enterSinglePrimaryKey(CQLParser.SinglePrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#singlePrimaryKey}.
	 * @param ctx the parse tree
	 */
	void exitSinglePrimaryKey(CQLParser.SinglePrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#compoundKey}.
	 * @param ctx the parse tree
	 */
	void enterCompoundKey(CQLParser.CompoundKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#compoundKey}.
	 * @param ctx the parse tree
	 */
	void exitCompoundKey(CQLParser.CompoundKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#compositeKey}.
	 * @param ctx the parse tree
	 */
	void enterCompositeKey(CQLParser.CompositeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#compositeKey}.
	 * @param ctx the parse tree
	 */
	void exitCompositeKey(CQLParser.CompositeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#partitionKeyList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionKeyList(CQLParser.PartitionKeyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#partitionKeyList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionKeyList(CQLParser.PartitionKeyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#clusteringKeyList}.
	 * @param ctx the parse tree
	 */
	void enterClusteringKeyList(CQLParser.ClusteringKeyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#clusteringKeyList}.
	 * @param ctx the parse tree
	 */
	void exitClusteringKeyList(CQLParser.ClusteringKeyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#partitionKey}.
	 * @param ctx the parse tree
	 */
	void enterPartitionKey(CQLParser.PartitionKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#partitionKey}.
	 * @param ctx the parse tree
	 */
	void exitPartitionKey(CQLParser.PartitionKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#clusteringKey}.
	 * @param ctx the parse tree
	 */
	void enterClusteringKey(CQLParser.ClusteringKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#clusteringKey}.
	 * @param ctx the parse tree
	 */
	void exitClusteringKey(CQLParser.ClusteringKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#applyBatch}.
	 * @param ctx the parse tree
	 */
	void enterApplyBatch(CQLParser.ApplyBatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#applyBatch}.
	 * @param ctx the parse tree
	 */
	void exitApplyBatch(CQLParser.ApplyBatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#beginBatch}.
	 * @param ctx the parse tree
	 */
	void enterBeginBatch(CQLParser.BeginBatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#beginBatch}.
	 * @param ctx the parse tree
	 */
	void exitBeginBatch(CQLParser.BeginBatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#batchType}.
	 * @param ctx the parse tree
	 */
	void enterBatchType(CQLParser.BatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#batchType}.
	 * @param ctx the parse tree
	 */
	void exitBatchType(CQLParser.BatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterKeyspace}.
	 * @param ctx the parse tree
	 */
	void enterAlterKeyspace(CQLParser.AlterKeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterKeyspace}.
	 * @param ctx the parse tree
	 */
	void exitAlterKeyspace(CQLParser.AlterKeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#replicationList}.
	 * @param ctx the parse tree
	 */
	void enterReplicationList(CQLParser.ReplicationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#replicationList}.
	 * @param ctx the parse tree
	 */
	void exitReplicationList(CQLParser.ReplicationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#replicationListItem}.
	 * @param ctx the parse tree
	 */
	void enterReplicationListItem(CQLParser.ReplicationListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#replicationListItem}.
	 * @param ctx the parse tree
	 */
	void exitReplicationListItem(CQLParser.ReplicationListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#durableWrites}.
	 * @param ctx the parse tree
	 */
	void enterDurableWrites(CQLParser.DurableWritesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#durableWrites}.
	 * @param ctx the parse tree
	 */
	void exitDurableWrites(CQLParser.DurableWritesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(CQLParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(CQLParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#truncate}.
	 * @param ctx the parse tree
	 */
	void enterTruncate(CQLParser.TruncateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#truncate}.
	 * @param ctx the parse tree
	 */
	void exitTruncate(CQLParser.TruncateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(CQLParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(CQLParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(CQLParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(CQLParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexColumnSpec}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnSpec(CQLParser.IndexColumnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexColumnSpec}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnSpec(CQLParser.IndexColumnSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexKeysSpec}.
	 * @param ctx the parse tree
	 */
	void enterIndexKeysSpec(CQLParser.IndexKeysSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexKeysSpec}.
	 * @param ctx the parse tree
	 */
	void exitIndexKeysSpec(CQLParser.IndexKeysSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexEntriesSSpec}.
	 * @param ctx the parse tree
	 */
	void enterIndexEntriesSSpec(CQLParser.IndexEntriesSSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexEntriesSSpec}.
	 * @param ctx the parse tree
	 */
	void exitIndexEntriesSSpec(CQLParser.IndexEntriesSSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexFullSpec}.
	 * @param ctx the parse tree
	 */
	void enterIndexFullSpec(CQLParser.IndexFullSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexFullSpec}.
	 * @param ctx the parse tree
	 */
	void exitIndexFullSpec(CQLParser.IndexFullSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(CQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(CQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#deleteColumnList}.
	 * @param ctx the parse tree
	 */
	void enterDeleteColumnList(CQLParser.DeleteColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#deleteColumnList}.
	 * @param ctx the parse tree
	 */
	void exitDeleteColumnList(CQLParser.DeleteColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#deleteColumnItem}.
	 * @param ctx the parse tree
	 */
	void enterDeleteColumnItem(CQLParser.DeleteColumnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#deleteColumnItem}.
	 * @param ctx the parse tree
	 */
	void exitDeleteColumnItem(CQLParser.DeleteColumnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(CQLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(CQLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifSpec}.
	 * @param ctx the parse tree
	 */
	void enterIfSpec(CQLParser.IfSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifSpec}.
	 * @param ctx the parse tree
	 */
	void exitIfSpec(CQLParser.IfSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifConditionList}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionList(CQLParser.IfConditionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifConditionList}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionList(CQLParser.IfConditionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(CQLParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(CQLParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(CQLParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(CQLParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentElement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentElement(CQLParser.AssignmentElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentElement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentElement(CQLParser.AssignmentElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentSet}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentSet(CQLParser.AssignmentSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentSet}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentSet(CQLParser.AssignmentSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentMap}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentMap(CQLParser.AssignmentMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentMap}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentMap(CQLParser.AssignmentMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(CQLParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(CQLParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentTuple}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentTuple(CQLParser.AssignmentTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentTuple}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentTuple(CQLParser.AssignmentTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(CQLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(CQLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#usingTtlTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterUsingTtlTimestamp(CQLParser.UsingTtlTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#usingTtlTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitUsingTtlTimestamp(CQLParser.UsingTtlTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(CQLParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(CQLParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ttl}.
	 * @param ctx the parse tree
	 */
	void enterTtl(CQLParser.TtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ttl}.
	 * @param ctx the parse tree
	 */
	void exitTtl(CQLParser.TtlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#usingTimestampSpec}.
	 * @param ctx the parse tree
	 */
	void enterUsingTimestampSpec(CQLParser.UsingTimestampSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#usingTimestampSpec}.
	 * @param ctx the parse tree
	 */
	void exitUsingTimestampSpec(CQLParser.UsingTimestampSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifNotExist}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExist(CQLParser.IfNotExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifNotExist}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExist(CQLParser.IfNotExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifExist}.
	 * @param ctx the parse tree
	 */
	void enterIfExist(CQLParser.IfExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifExist}.
	 * @param ctx the parse tree
	 */
	void exitIfExist(CQLParser.IfExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#insertValuesSpec}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesSpec(CQLParser.InsertValuesSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#insertValuesSpec}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesSpec(CQLParser.InsertValuesSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#insertColumnSpec}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnSpec(CQLParser.InsertColumnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#insertColumnSpec}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnSpec(CQLParser.InsertColumnSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(CQLParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(CQLParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CQLParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CQLParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(CQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(CQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#allowFilteringSpec}.
	 * @param ctx the parse tree
	 */
	void enterAllowFilteringSpec(CQLParser.AllowFilteringSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#allowFilteringSpec}.
	 * @param ctx the parse tree
	 */
	void exitAllowFilteringSpec(CQLParser.AllowFilteringSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#limitSpec}.
	 * @param ctx the parse tree
	 */
	void enterLimitSpec(CQLParser.LimitSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#limitSpec}.
	 * @param ctx the parse tree
	 */
	void exitLimitSpec(CQLParser.LimitSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#fromSpec}.
	 * @param ctx the parse tree
	 */
	void enterFromSpec(CQLParser.FromSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#fromSpec}.
	 * @param ctx the parse tree
	 */
	void exitFromSpec(CQLParser.FromSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#fromSpecElement}.
	 * @param ctx the parse tree
	 */
	void enterFromSpecElement(CQLParser.FromSpecElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#fromSpecElement}.
	 * @param ctx the parse tree
	 */
	void exitFromSpecElement(CQLParser.FromSpecElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#orderSpec}.
	 * @param ctx the parse tree
	 */
	void enterOrderSpec(CQLParser.OrderSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#orderSpec}.
	 * @param ctx the parse tree
	 */
	void exitOrderSpec(CQLParser.OrderSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#orderSpecElement}.
	 * @param ctx the parse tree
	 */
	void enterOrderSpecElement(CQLParser.OrderSpecElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#orderSpecElement}.
	 * @param ctx the parse tree
	 */
	void exitOrderSpecElement(CQLParser.OrderSpecElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#whereSpec}.
	 * @param ctx the parse tree
	 */
	void enterWhereSpec(CQLParser.WhereSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#whereSpec}.
	 * @param ctx the parse tree
	 */
	void exitWhereSpec(CQLParser.WhereSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#distinctSpec}.
	 * @param ctx the parse tree
	 */
	void enterDistinctSpec(CQLParser.DistinctSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#distinctSpec}.
	 * @param ctx the parse tree
	 */
	void exitDistinctSpec(CQLParser.DistinctSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(CQLParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(CQLParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(CQLParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(CQLParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#relationElements}.
	 * @param ctx the parse tree
	 */
	void enterRelationElements(CQLParser.RelationElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#relationElements}.
	 * @param ctx the parse tree
	 */
	void exitRelationElements(CQLParser.RelationElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#relationElement}.
	 * @param ctx the parse tree
	 */
	void enterRelationElement(CQLParser.RelationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#relationElement}.
	 * @param ctx the parse tree
	 */
	void exitRelationElement(CQLParser.RelationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#relalationContains}.
	 * @param ctx the parse tree
	 */
	void enterRelalationContains(CQLParser.RelalationContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#relalationContains}.
	 * @param ctx the parse tree
	 */
	void exitRelalationContains(CQLParser.RelalationContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#relalationContainsKey}.
	 * @param ctx the parse tree
	 */
	void enterRelalationContainsKey(CQLParser.RelalationContainsKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#relalationContainsKey}.
	 * @param ctx the parse tree
	 */
	void exitRelalationContainsKey(CQLParser.RelalationContainsKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(CQLParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(CQLParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(CQLParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(CQLParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(CQLParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(CQLParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(CQLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(CQLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(CQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(CQLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(CQLParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(CQLParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#keyspace}.
	 * @param ctx the parse tree
	 */
	void enterKeyspace(CQLParser.KeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#keyspace}.
	 * @param ctx the parse tree
	 */
	void exitKeyspace(CQLParser.KeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(CQLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(CQLParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(CQLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(CQLParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(CQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(CQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(CQLParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(CQLParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dataTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDefinition(CQLParser.DataTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dataTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDefinition(CQLParser.DataTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#orderDirection}.
	 * @param ctx the parse tree
	 */
	void enterOrderDirection(CQLParser.OrderDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#orderDirection}.
	 * @param ctx the parse tree
	 */
	void exitOrderDirection(CQLParser.OrderDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(CQLParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(CQLParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#trigger}.
	 * @param ctx the parse tree
	 */
	void enterTrigger(CQLParser.TriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#trigger}.
	 * @param ctx the parse tree
	 */
	void exitTrigger(CQLParser.TriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#triggerClass}.
	 * @param ctx the parse tree
	 */
	void enterTriggerClass(CQLParser.TriggerClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#triggerClass}.
	 * @param ctx the parse tree
	 */
	void exitTriggerClass(CQLParser.TriggerClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#materializedView}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedView(CQLParser.MaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#materializedView}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedView(CQLParser.MaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CQLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CQLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(CQLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(CQLParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CQLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CQLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(CQLParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(CQLParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(CQLParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(CQLParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(CQLParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(CQLParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#hashKey}.
	 * @param ctx the parse tree
	 */
	void enterHashKey(CQLParser.HashKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#hashKey}.
	 * @param ctx the parse tree
	 */
	void exitHashKey(CQLParser.HashKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CQLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CQLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(CQLParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(CQLParser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAdd}.
	 * @param ctx the parse tree
	 */
	void enterKwAdd(CQLParser.KwAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAdd}.
	 * @param ctx the parse tree
	 */
	void exitKwAdd(CQLParser.KwAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAggregate}.
	 * @param ctx the parse tree
	 */
	void enterKwAggregate(CQLParser.KwAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAggregate}.
	 * @param ctx the parse tree
	 */
	void exitKwAggregate(CQLParser.KwAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAll}.
	 * @param ctx the parse tree
	 */
	void enterKwAll(CQLParser.KwAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAll}.
	 * @param ctx the parse tree
	 */
	void exitKwAll(CQLParser.KwAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAllPermissions}.
	 * @param ctx the parse tree
	 */
	void enterKwAllPermissions(CQLParser.KwAllPermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAllPermissions}.
	 * @param ctx the parse tree
	 */
	void exitKwAllPermissions(CQLParser.KwAllPermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAllow}.
	 * @param ctx the parse tree
	 */
	void enterKwAllow(CQLParser.KwAllowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAllow}.
	 * @param ctx the parse tree
	 */
	void exitKwAllow(CQLParser.KwAllowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAlter}.
	 * @param ctx the parse tree
	 */
	void enterKwAlter(CQLParser.KwAlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAlter}.
	 * @param ctx the parse tree
	 */
	void exitKwAlter(CQLParser.KwAlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAnd}.
	 * @param ctx the parse tree
	 */
	void enterKwAnd(CQLParser.KwAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAnd}.
	 * @param ctx the parse tree
	 */
	void exitKwAnd(CQLParser.KwAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwApply}.
	 * @param ctx the parse tree
	 */
	void enterKwApply(CQLParser.KwApplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwApply}.
	 * @param ctx the parse tree
	 */
	void exitKwApply(CQLParser.KwApplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAs}.
	 * @param ctx the parse tree
	 */
	void enterKwAs(CQLParser.KwAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAs}.
	 * @param ctx the parse tree
	 */
	void exitKwAs(CQLParser.KwAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAsc}.
	 * @param ctx the parse tree
	 */
	void enterKwAsc(CQLParser.KwAscContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAsc}.
	 * @param ctx the parse tree
	 */
	void exitKwAsc(CQLParser.KwAscContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAuthorize}.
	 * @param ctx the parse tree
	 */
	void enterKwAuthorize(CQLParser.KwAuthorizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAuthorize}.
	 * @param ctx the parse tree
	 */
	void exitKwAuthorize(CQLParser.KwAuthorizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwBatch}.
	 * @param ctx the parse tree
	 */
	void enterKwBatch(CQLParser.KwBatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwBatch}.
	 * @param ctx the parse tree
	 */
	void exitKwBatch(CQLParser.KwBatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwBegin}.
	 * @param ctx the parse tree
	 */
	void enterKwBegin(CQLParser.KwBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwBegin}.
	 * @param ctx the parse tree
	 */
	void exitKwBegin(CQLParser.KwBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwBy}.
	 * @param ctx the parse tree
	 */
	void enterKwBy(CQLParser.KwByContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwBy}.
	 * @param ctx the parse tree
	 */
	void exitKwBy(CQLParser.KwByContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwCalled}.
	 * @param ctx the parse tree
	 */
	void enterKwCalled(CQLParser.KwCalledContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwCalled}.
	 * @param ctx the parse tree
	 */
	void exitKwCalled(CQLParser.KwCalledContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwClustering}.
	 * @param ctx the parse tree
	 */
	void enterKwClustering(CQLParser.KwClusteringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwClustering}.
	 * @param ctx the parse tree
	 */
	void exitKwClustering(CQLParser.KwClusteringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwCompact}.
	 * @param ctx the parse tree
	 */
	void enterKwCompact(CQLParser.KwCompactContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwCompact}.
	 * @param ctx the parse tree
	 */
	void exitKwCompact(CQLParser.KwCompactContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwContains}.
	 * @param ctx the parse tree
	 */
	void enterKwContains(CQLParser.KwContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwContains}.
	 * @param ctx the parse tree
	 */
	void exitKwContains(CQLParser.KwContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwCreate}.
	 * @param ctx the parse tree
	 */
	void enterKwCreate(CQLParser.KwCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwCreate}.
	 * @param ctx the parse tree
	 */
	void exitKwCreate(CQLParser.KwCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDelete}.
	 * @param ctx the parse tree
	 */
	void enterKwDelete(CQLParser.KwDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDelete}.
	 * @param ctx the parse tree
	 */
	void exitKwDelete(CQLParser.KwDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDesc}.
	 * @param ctx the parse tree
	 */
	void enterKwDesc(CQLParser.KwDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDesc}.
	 * @param ctx the parse tree
	 */
	void exitKwDesc(CQLParser.KwDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDescibe}.
	 * @param ctx the parse tree
	 */
	void enterKwDescibe(CQLParser.KwDescibeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDescibe}.
	 * @param ctx the parse tree
	 */
	void exitKwDescibe(CQLParser.KwDescibeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDistinct}.
	 * @param ctx the parse tree
	 */
	void enterKwDistinct(CQLParser.KwDistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDistinct}.
	 * @param ctx the parse tree
	 */
	void exitKwDistinct(CQLParser.KwDistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDrop}.
	 * @param ctx the parse tree
	 */
	void enterKwDrop(CQLParser.KwDropContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDrop}.
	 * @param ctx the parse tree
	 */
	void exitKwDrop(CQLParser.KwDropContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDurableWrites}.
	 * @param ctx the parse tree
	 */
	void enterKwDurableWrites(CQLParser.KwDurableWritesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDurableWrites}.
	 * @param ctx the parse tree
	 */
	void exitKwDurableWrites(CQLParser.KwDurableWritesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwEntries}.
	 * @param ctx the parse tree
	 */
	void enterKwEntries(CQLParser.KwEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwEntries}.
	 * @param ctx the parse tree
	 */
	void exitKwEntries(CQLParser.KwEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwExecute}.
	 * @param ctx the parse tree
	 */
	void enterKwExecute(CQLParser.KwExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwExecute}.
	 * @param ctx the parse tree
	 */
	void exitKwExecute(CQLParser.KwExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwExists}.
	 * @param ctx the parse tree
	 */
	void enterKwExists(CQLParser.KwExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwExists}.
	 * @param ctx the parse tree
	 */
	void exitKwExists(CQLParser.KwExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFiltering}.
	 * @param ctx the parse tree
	 */
	void enterKwFiltering(CQLParser.KwFilteringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFiltering}.
	 * @param ctx the parse tree
	 */
	void exitKwFiltering(CQLParser.KwFilteringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFinalfunc}.
	 * @param ctx the parse tree
	 */
	void enterKwFinalfunc(CQLParser.KwFinalfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFinalfunc}.
	 * @param ctx the parse tree
	 */
	void exitKwFinalfunc(CQLParser.KwFinalfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFrom}.
	 * @param ctx the parse tree
	 */
	void enterKwFrom(CQLParser.KwFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFrom}.
	 * @param ctx the parse tree
	 */
	void exitKwFrom(CQLParser.KwFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFull}.
	 * @param ctx the parse tree
	 */
	void enterKwFull(CQLParser.KwFullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFull}.
	 * @param ctx the parse tree
	 */
	void exitKwFull(CQLParser.KwFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFunction}.
	 * @param ctx the parse tree
	 */
	void enterKwFunction(CQLParser.KwFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFunction}.
	 * @param ctx the parse tree
	 */
	void exitKwFunction(CQLParser.KwFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFunctions}.
	 * @param ctx the parse tree
	 */
	void enterKwFunctions(CQLParser.KwFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFunctions}.
	 * @param ctx the parse tree
	 */
	void exitKwFunctions(CQLParser.KwFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwGrant}.
	 * @param ctx the parse tree
	 */
	void enterKwGrant(CQLParser.KwGrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwGrant}.
	 * @param ctx the parse tree
	 */
	void exitKwGrant(CQLParser.KwGrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwIf}.
	 * @param ctx the parse tree
	 */
	void enterKwIf(CQLParser.KwIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwIf}.
	 * @param ctx the parse tree
	 */
	void exitKwIf(CQLParser.KwIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwIn}.
	 * @param ctx the parse tree
	 */
	void enterKwIn(CQLParser.KwInContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwIn}.
	 * @param ctx the parse tree
	 */
	void exitKwIn(CQLParser.KwInContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwIndex}.
	 * @param ctx the parse tree
	 */
	void enterKwIndex(CQLParser.KwIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwIndex}.
	 * @param ctx the parse tree
	 */
	void exitKwIndex(CQLParser.KwIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwInitcond}.
	 * @param ctx the parse tree
	 */
	void enterKwInitcond(CQLParser.KwInitcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwInitcond}.
	 * @param ctx the parse tree
	 */
	void exitKwInitcond(CQLParser.KwInitcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwInput}.
	 * @param ctx the parse tree
	 */
	void enterKwInput(CQLParser.KwInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwInput}.
	 * @param ctx the parse tree
	 */
	void exitKwInput(CQLParser.KwInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwInsert}.
	 * @param ctx the parse tree
	 */
	void enterKwInsert(CQLParser.KwInsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwInsert}.
	 * @param ctx the parse tree
	 */
	void exitKwInsert(CQLParser.KwInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwInto}.
	 * @param ctx the parse tree
	 */
	void enterKwInto(CQLParser.KwIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwInto}.
	 * @param ctx the parse tree
	 */
	void exitKwInto(CQLParser.KwIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwIs}.
	 * @param ctx the parse tree
	 */
	void enterKwIs(CQLParser.KwIsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwIs}.
	 * @param ctx the parse tree
	 */
	void exitKwIs(CQLParser.KwIsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwJson}.
	 * @param ctx the parse tree
	 */
	void enterKwJson(CQLParser.KwJsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwJson}.
	 * @param ctx the parse tree
	 */
	void exitKwJson(CQLParser.KwJsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwKey}.
	 * @param ctx the parse tree
	 */
	void enterKwKey(CQLParser.KwKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwKey}.
	 * @param ctx the parse tree
	 */
	void exitKwKey(CQLParser.KwKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwKeys}.
	 * @param ctx the parse tree
	 */
	void enterKwKeys(CQLParser.KwKeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwKeys}.
	 * @param ctx the parse tree
	 */
	void exitKwKeys(CQLParser.KwKeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwKeyspace}.
	 * @param ctx the parse tree
	 */
	void enterKwKeyspace(CQLParser.KwKeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwKeyspace}.
	 * @param ctx the parse tree
	 */
	void exitKwKeyspace(CQLParser.KwKeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwKeyspaces}.
	 * @param ctx the parse tree
	 */
	void enterKwKeyspaces(CQLParser.KwKeyspacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwKeyspaces}.
	 * @param ctx the parse tree
	 */
	void exitKwKeyspaces(CQLParser.KwKeyspacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwLanguage}.
	 * @param ctx the parse tree
	 */
	void enterKwLanguage(CQLParser.KwLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwLanguage}.
	 * @param ctx the parse tree
	 */
	void exitKwLanguage(CQLParser.KwLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwLimit}.
	 * @param ctx the parse tree
	 */
	void enterKwLimit(CQLParser.KwLimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwLimit}.
	 * @param ctx the parse tree
	 */
	void exitKwLimit(CQLParser.KwLimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwList}.
	 * @param ctx the parse tree
	 */
	void enterKwList(CQLParser.KwListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwList}.
	 * @param ctx the parse tree
	 */
	void exitKwList(CQLParser.KwListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwLogged}.
	 * @param ctx the parse tree
	 */
	void enterKwLogged(CQLParser.KwLoggedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwLogged}.
	 * @param ctx the parse tree
	 */
	void exitKwLogged(CQLParser.KwLoggedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwLogin}.
	 * @param ctx the parse tree
	 */
	void enterKwLogin(CQLParser.KwLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwLogin}.
	 * @param ctx the parse tree
	 */
	void exitKwLogin(CQLParser.KwLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwMaterialized}.
	 * @param ctx the parse tree
	 */
	void enterKwMaterialized(CQLParser.KwMaterializedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwMaterialized}.
	 * @param ctx the parse tree
	 */
	void exitKwMaterialized(CQLParser.KwMaterializedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwModify}.
	 * @param ctx the parse tree
	 */
	void enterKwModify(CQLParser.KwModifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwModify}.
	 * @param ctx the parse tree
	 */
	void exitKwModify(CQLParser.KwModifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwNosuperuser}.
	 * @param ctx the parse tree
	 */
	void enterKwNosuperuser(CQLParser.KwNosuperuserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwNosuperuser}.
	 * @param ctx the parse tree
	 */
	void exitKwNosuperuser(CQLParser.KwNosuperuserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwNorecursive}.
	 * @param ctx the parse tree
	 */
	void enterKwNorecursive(CQLParser.KwNorecursiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwNorecursive}.
	 * @param ctx the parse tree
	 */
	void exitKwNorecursive(CQLParser.KwNorecursiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwNot}.
	 * @param ctx the parse tree
	 */
	void enterKwNot(CQLParser.KwNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwNot}.
	 * @param ctx the parse tree
	 */
	void exitKwNot(CQLParser.KwNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwNull}.
	 * @param ctx the parse tree
	 */
	void enterKwNull(CQLParser.KwNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwNull}.
	 * @param ctx the parse tree
	 */
	void exitKwNull(CQLParser.KwNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOf}.
	 * @param ctx the parse tree
	 */
	void enterKwOf(CQLParser.KwOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOf}.
	 * @param ctx the parse tree
	 */
	void exitKwOf(CQLParser.KwOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOn}.
	 * @param ctx the parse tree
	 */
	void enterKwOn(CQLParser.KwOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOn}.
	 * @param ctx the parse tree
	 */
	void exitKwOn(CQLParser.KwOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOptions}.
	 * @param ctx the parse tree
	 */
	void enterKwOptions(CQLParser.KwOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOptions}.
	 * @param ctx the parse tree
	 */
	void exitKwOptions(CQLParser.KwOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOr}.
	 * @param ctx the parse tree
	 */
	void enterKwOr(CQLParser.KwOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOr}.
	 * @param ctx the parse tree
	 */
	void exitKwOr(CQLParser.KwOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOrder}.
	 * @param ctx the parse tree
	 */
	void enterKwOrder(CQLParser.KwOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOrder}.
	 * @param ctx the parse tree
	 */
	void exitKwOrder(CQLParser.KwOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwPassword}.
	 * @param ctx the parse tree
	 */
	void enterKwPassword(CQLParser.KwPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwPassword}.
	 * @param ctx the parse tree
	 */
	void exitKwPassword(CQLParser.KwPasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwPrimary}.
	 * @param ctx the parse tree
	 */
	void enterKwPrimary(CQLParser.KwPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwPrimary}.
	 * @param ctx the parse tree
	 */
	void exitKwPrimary(CQLParser.KwPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwRename}.
	 * @param ctx the parse tree
	 */
	void enterKwRename(CQLParser.KwRenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwRename}.
	 * @param ctx the parse tree
	 */
	void exitKwRename(CQLParser.KwRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwReplace}.
	 * @param ctx the parse tree
	 */
	void enterKwReplace(CQLParser.KwReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwReplace}.
	 * @param ctx the parse tree
	 */
	void exitKwReplace(CQLParser.KwReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwReplication}.
	 * @param ctx the parse tree
	 */
	void enterKwReplication(CQLParser.KwReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwReplication}.
	 * @param ctx the parse tree
	 */
	void exitKwReplication(CQLParser.KwReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwReturns}.
	 * @param ctx the parse tree
	 */
	void enterKwReturns(CQLParser.KwReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwReturns}.
	 * @param ctx the parse tree
	 */
	void exitKwReturns(CQLParser.KwReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwRole}.
	 * @param ctx the parse tree
	 */
	void enterKwRole(CQLParser.KwRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwRole}.
	 * @param ctx the parse tree
	 */
	void exitKwRole(CQLParser.KwRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwRoles}.
	 * @param ctx the parse tree
	 */
	void enterKwRoles(CQLParser.KwRolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwRoles}.
	 * @param ctx the parse tree
	 */
	void exitKwRoles(CQLParser.KwRolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwSelect}.
	 * @param ctx the parse tree
	 */
	void enterKwSelect(CQLParser.KwSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwSelect}.
	 * @param ctx the parse tree
	 */
	void exitKwSelect(CQLParser.KwSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwSet}.
	 * @param ctx the parse tree
	 */
	void enterKwSet(CQLParser.KwSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwSet}.
	 * @param ctx the parse tree
	 */
	void exitKwSet(CQLParser.KwSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwSfunc}.
	 * @param ctx the parse tree
	 */
	void enterKwSfunc(CQLParser.KwSfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwSfunc}.
	 * @param ctx the parse tree
	 */
	void exitKwSfunc(CQLParser.KwSfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwStorage}.
	 * @param ctx the parse tree
	 */
	void enterKwStorage(CQLParser.KwStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwStorage}.
	 * @param ctx the parse tree
	 */
	void exitKwStorage(CQLParser.KwStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwStype}.
	 * @param ctx the parse tree
	 */
	void enterKwStype(CQLParser.KwStypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwStype}.
	 * @param ctx the parse tree
	 */
	void exitKwStype(CQLParser.KwStypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwSuperuser}.
	 * @param ctx the parse tree
	 */
	void enterKwSuperuser(CQLParser.KwSuperuserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwSuperuser}.
	 * @param ctx the parse tree
	 */
	void exitKwSuperuser(CQLParser.KwSuperuserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTable}.
	 * @param ctx the parse tree
	 */
	void enterKwTable(CQLParser.KwTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTable}.
	 * @param ctx the parse tree
	 */
	void exitKwTable(CQLParser.KwTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterKwTimestamp(CQLParser.KwTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitKwTimestamp(CQLParser.KwTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTo}.
	 * @param ctx the parse tree
	 */
	void enterKwTo(CQLParser.KwToContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTo}.
	 * @param ctx the parse tree
	 */
	void exitKwTo(CQLParser.KwToContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTrigger}.
	 * @param ctx the parse tree
	 */
	void enterKwTrigger(CQLParser.KwTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTrigger}.
	 * @param ctx the parse tree
	 */
	void exitKwTrigger(CQLParser.KwTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTruncate}.
	 * @param ctx the parse tree
	 */
	void enterKwTruncate(CQLParser.KwTruncateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTruncate}.
	 * @param ctx the parse tree
	 */
	void exitKwTruncate(CQLParser.KwTruncateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTtl}.
	 * @param ctx the parse tree
	 */
	void enterKwTtl(CQLParser.KwTtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTtl}.
	 * @param ctx the parse tree
	 */
	void exitKwTtl(CQLParser.KwTtlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwType}.
	 * @param ctx the parse tree
	 */
	void enterKwType(CQLParser.KwTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwType}.
	 * @param ctx the parse tree
	 */
	void exitKwType(CQLParser.KwTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUnlogged}.
	 * @param ctx the parse tree
	 */
	void enterKwUnlogged(CQLParser.KwUnloggedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUnlogged}.
	 * @param ctx the parse tree
	 */
	void exitKwUnlogged(CQLParser.KwUnloggedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUpdate}.
	 * @param ctx the parse tree
	 */
	void enterKwUpdate(CQLParser.KwUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUpdate}.
	 * @param ctx the parse tree
	 */
	void exitKwUpdate(CQLParser.KwUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUse}.
	 * @param ctx the parse tree
	 */
	void enterKwUse(CQLParser.KwUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUse}.
	 * @param ctx the parse tree
	 */
	void exitKwUse(CQLParser.KwUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUser}.
	 * @param ctx the parse tree
	 */
	void enterKwUser(CQLParser.KwUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUser}.
	 * @param ctx the parse tree
	 */
	void exitKwUser(CQLParser.KwUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUsers}.
	 * @param ctx the parse tree
	 */
	void enterKwUsers(CQLParser.KwUsersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUsers}.
	 * @param ctx the parse tree
	 */
	void exitKwUsers(CQLParser.KwUsersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUsing}.
	 * @param ctx the parse tree
	 */
	void enterKwUsing(CQLParser.KwUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUsing}.
	 * @param ctx the parse tree
	 */
	void exitKwUsing(CQLParser.KwUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwValues}.
	 * @param ctx the parse tree
	 */
	void enterKwValues(CQLParser.KwValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwValues}.
	 * @param ctx the parse tree
	 */
	void exitKwValues(CQLParser.KwValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwView}.
	 * @param ctx the parse tree
	 */
	void enterKwView(CQLParser.KwViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwView}.
	 * @param ctx the parse tree
	 */
	void exitKwView(CQLParser.KwViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwWhere}.
	 * @param ctx the parse tree
	 */
	void enterKwWhere(CQLParser.KwWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwWhere}.
	 * @param ctx the parse tree
	 */
	void exitKwWhere(CQLParser.KwWhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwWith}.
	 * @param ctx the parse tree
	 */
	void enterKwWith(CQLParser.KwWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwWith}.
	 * @param ctx the parse tree
	 */
	void exitKwWith(CQLParser.KwWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwRevoke}.
	 * @param ctx the parse tree
	 */
	void enterKwRevoke(CQLParser.KwRevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwRevoke}.
	 * @param ctx the parse tree
	 */
	void exitKwRevoke(CQLParser.KwRevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(CQLParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(CQLParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketLr}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketLr(CQLParser.SyntaxBracketLrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketLr}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketLr(CQLParser.SyntaxBracketLrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketRr}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketRr(CQLParser.SyntaxBracketRrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketRr}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketRr(CQLParser.SyntaxBracketRrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketLc}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketLc(CQLParser.SyntaxBracketLcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketLc}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketLc(CQLParser.SyntaxBracketLcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketRc}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketRc(CQLParser.SyntaxBracketRcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketRc}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketRc(CQLParser.SyntaxBracketRcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketLa}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketLa(CQLParser.SyntaxBracketLaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketLa}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketLa(CQLParser.SyntaxBracketLaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketRa}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketRa(CQLParser.SyntaxBracketRaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketRa}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketRa(CQLParser.SyntaxBracketRaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketLs}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketLs(CQLParser.SyntaxBracketLsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketLs}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketLs(CQLParser.SyntaxBracketLsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketRs}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketRs(CQLParser.SyntaxBracketRsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketRs}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketRs(CQLParser.SyntaxBracketRsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxComma}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxComma(CQLParser.SyntaxCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxComma}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxComma(CQLParser.SyntaxCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxColon}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxColon(CQLParser.SyntaxColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxColon}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxColon(CQLParser.SyntaxColonContext ctx);
}