// Generated from CQLParser.g4 by ANTLR 4.4
package com.github.amolnayak.cassandra.cql3;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CQLParser}.
 */
public interface CQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableRename}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableRename(@NotNull CQLParser.AlterTableRenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableRename}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableRename(@NotNull CQLParser.AlterTableRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull CQLParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull CQLParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwLimit}.
	 * @param ctx the parse tree
	 */
	void enterKwLimit(@NotNull CQLParser.KwLimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwLimit}.
	 * @param ctx the parse tree
	 */
	void exitKwLimit(@NotNull CQLParser.KwLimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwCalled}.
	 * @param ctx the parse tree
	 */
	void enterKwCalled(@NotNull CQLParser.KwCalledContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwCalled}.
	 * @param ctx the parse tree
	 */
	void exitKwCalled(@NotNull CQLParser.KwCalledContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(@NotNull CQLParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(@NotNull CQLParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableAdd}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAdd(@NotNull CQLParser.AlterTableAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableAdd}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAdd(@NotNull CQLParser.AlterTableAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwNosuperuser}.
	 * @param ctx the parse tree
	 */
	void enterKwNosuperuser(@NotNull CQLParser.KwNosuperuserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwNosuperuser}.
	 * @param ctx the parse tree
	 */
	void exitKwNosuperuser(@NotNull CQLParser.KwNosuperuserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwSelect}.
	 * @param ctx the parse tree
	 */
	void enterKwSelect(@NotNull CQLParser.KwSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwSelect}.
	 * @param ctx the parse tree
	 */
	void exitKwSelect(@NotNull CQLParser.KwSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#usingTimestampSpec}.
	 * @param ctx the parse tree
	 */
	void enterUsingTimestampSpec(@NotNull CQLParser.UsingTimestampSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#usingTimestampSpec}.
	 * @param ctx the parse tree
	 */
	void exitUsingTimestampSpec(@NotNull CQLParser.UsingTimestampSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(@NotNull CQLParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(@NotNull CQLParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableDropCompactStorage}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropCompactStorage(@NotNull CQLParser.AlterTableDropCompactStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableDropCompactStorage}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropCompactStorage(@NotNull CQLParser.AlterTableDropCompactStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexEntriesSSpec}.
	 * @param ctx the parse tree
	 */
	void enterIndexEntriesSSpec(@NotNull CQLParser.IndexEntriesSSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexEntriesSSpec}.
	 * @param ctx the parse tree
	 */
	void exitIndexEntriesSSpec(@NotNull CQLParser.IndexEntriesSSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#allowFilteringSpec}.
	 * @param ctx the parse tree
	 */
	void enterAllowFilteringSpec(@NotNull CQLParser.AllowFilteringSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#allowFilteringSpec}.
	 * @param ctx the parse tree
	 */
	void exitAllowFilteringSpec(@NotNull CQLParser.AllowFilteringSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwRename}.
	 * @param ctx the parse tree
	 */
	void enterKwRename(@NotNull CQLParser.KwRenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwRename}.
	 * @param ctx the parse tree
	 */
	void exitKwRename(@NotNull CQLParser.KwRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUser}.
	 * @param ctx the parse tree
	 */
	void enterKwUser(@NotNull CQLParser.KwUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUser}.
	 * @param ctx the parse tree
	 */
	void exitKwUser(@NotNull CQLParser.KwUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#distinctSpec}.
	 * @param ctx the parse tree
	 */
	void enterDistinctSpec(@NotNull CQLParser.DistinctSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#distinctSpec}.
	 * @param ctx the parse tree
	 */
	void exitDistinctSpec(@NotNull CQLParser.DistinctSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#replicationList}.
	 * @param ctx the parse tree
	 */
	void enterReplicationList(@NotNull CQLParser.ReplicationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#replicationList}.
	 * @param ctx the parse tree
	 */
	void exitReplicationList(@NotNull CQLParser.ReplicationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableDropColumns}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropColumns(@NotNull CQLParser.AlterTableDropColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableDropColumns}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropColumns(@NotNull CQLParser.AlterTableDropColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableOperation(@NotNull CQLParser.AlterTableOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableOperation(@NotNull CQLParser.AlterTableOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAggregate}.
	 * @param ctx the parse tree
	 */
	void enterKwAggregate(@NotNull CQLParser.KwAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAggregate}.
	 * @param ctx the parse tree
	 */
	void exitKwAggregate(@NotNull CQLParser.KwAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwLogged}.
	 * @param ctx the parse tree
	 */
	void enterKwLogged(@NotNull CQLParser.KwLoggedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwLogged}.
	 * @param ctx the parse tree
	 */
	void exitKwLogged(@NotNull CQLParser.KwLoggedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAllow}.
	 * @param ctx the parse tree
	 */
	void enterKwAllow(@NotNull CQLParser.KwAllowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAllow}.
	 * @param ctx the parse tree
	 */
	void exitKwAllow(@NotNull CQLParser.KwAllowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeOperation(@NotNull CQLParser.AlterTypeOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeOperation(@NotNull CQLParser.AlterTypeOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentElement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentElement(@NotNull CQLParser.AssignmentElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentElement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentElement(@NotNull CQLParser.AssignmentElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwCompact}.
	 * @param ctx the parse tree
	 */
	void enterKwCompact(@NotNull CQLParser.KwCompactContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwCompact}.
	 * @param ctx the parse tree
	 */
	void exitKwCompact(@NotNull CQLParser.KwCompactContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(@NotNull CQLParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(@NotNull CQLParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull CQLParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull CQLParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwStype}.
	 * @param ctx the parse tree
	 */
	void enterKwStype(@NotNull CQLParser.KwStypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwStype}.
	 * @param ctx the parse tree
	 */
	void exitKwStype(@NotNull CQLParser.KwStypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeAlterType}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeAlterType(@NotNull CQLParser.AlterTypeAlterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeAlterType}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeAlterType(@NotNull CQLParser.AlterTypeAlterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwBatch}.
	 * @param ctx the parse tree
	 */
	void enterKwBatch(@NotNull CQLParser.KwBatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwBatch}.
	 * @param ctx the parse tree
	 */
	void exitKwBatch(@NotNull CQLParser.KwBatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnNotNullList}.
	 * @param ctx the parse tree
	 */
	void enterColumnNotNullList(@NotNull CQLParser.ColumnNotNullListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnNotNullList}.
	 * @param ctx the parse tree
	 */
	void exitColumnNotNullList(@NotNull CQLParser.ColumnNotNullListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#orderDirection}.
	 * @param ctx the parse tree
	 */
	void enterOrderDirection(@NotNull CQLParser.OrderDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#orderDirection}.
	 * @param ctx the parse tree
	 */
	void exitOrderDirection(@NotNull CQLParser.OrderDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterAlterMaterializedView(@NotNull CQLParser.AlterMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitAlterMaterializedView(@NotNull CQLParser.AlterMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#batchType}.
	 * @param ctx the parse tree
	 */
	void enterBatchType(@NotNull CQLParser.BatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#batchType}.
	 * @param ctx the parse tree
	 */
	void exitBatchType(@NotNull CQLParser.BatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTruncate}.
	 * @param ctx the parse tree
	 */
	void enterKwTruncate(@NotNull CQLParser.KwTruncateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTruncate}.
	 * @param ctx the parse tree
	 */
	void exitKwTruncate(@NotNull CQLParser.KwTruncateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwInput}.
	 * @param ctx the parse tree
	 */
	void enterKwInput(@NotNull CQLParser.KwInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwInput}.
	 * @param ctx the parse tree
	 */
	void exitKwInput(@NotNull CQLParser.KwInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwStorage}.
	 * @param ctx the parse tree
	 */
	void enterKwStorage(@NotNull CQLParser.KwStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwStorage}.
	 * @param ctx the parse tree
	 */
	void exitKwStorage(@NotNull CQLParser.KwStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#roleWith}.
	 * @param ctx the parse tree
	 */
	void enterRoleWith(@NotNull CQLParser.RoleWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#roleWith}.
	 * @param ctx the parse tree
	 */
	void exitRoleWith(@NotNull CQLParser.RoleWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterKeyspace}.
	 * @param ctx the parse tree
	 */
	void enterAlterKeyspace(@NotNull CQLParser.AlterKeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterKeyspace}.
	 * @param ctx the parse tree
	 */
	void exitAlterKeyspace(@NotNull CQLParser.AlterKeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#deleteColumnItem}.
	 * @param ctx the parse tree
	 */
	void enterDeleteColumnItem(@NotNull CQLParser.DeleteColumnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#deleteColumnItem}.
	 * @param ctx the parse tree
	 */
	void exitDeleteColumnItem(@NotNull CQLParser.DeleteColumnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#relalationContains}.
	 * @param ctx the parse tree
	 */
	void enterRelalationContains(@NotNull CQLParser.RelalationContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#relalationContains}.
	 * @param ctx the parse tree
	 */
	void exitRelalationContains(@NotNull CQLParser.RelalationContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(@NotNull CQLParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(@NotNull CQLParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#insertValuesSpec}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesSpec(@NotNull CQLParser.InsertValuesSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#insertValuesSpec}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesSpec(@NotNull CQLParser.InsertValuesSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwKeyspaces}.
	 * @param ctx the parse tree
	 */
	void enterKwKeyspaces(@NotNull CQLParser.KwKeyspacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwKeyspaces}.
	 * @param ctx the parse tree
	 */
	void exitKwKeyspaces(@NotNull CQLParser.KwKeyspacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwExists}.
	 * @param ctx the parse tree
	 */
	void enterKwExists(@NotNull CQLParser.KwExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwExists}.
	 * @param ctx the parse tree
	 */
	void exitKwExists(@NotNull CQLParser.KwExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(@NotNull CQLParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(@NotNull CQLParser.TableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#orderSpecElement}.
	 * @param ctx the parse tree
	 */
	void enterOrderSpecElement(@NotNull CQLParser.OrderSpecElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#orderSpecElement}.
	 * @param ctx the parse tree
	 */
	void exitOrderSpecElement(@NotNull CQLParser.OrderSpecElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableOptionValue}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionValue(@NotNull CQLParser.TableOptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableOptionValue}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionValue(@NotNull CQLParser.TableOptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwPrimary}.
	 * @param ctx the parse tree
	 */
	void enterKwPrimary(@NotNull CQLParser.KwPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwPrimary}.
	 * @param ctx the parse tree
	 */
	void exitKwPrimary(@NotNull CQLParser.KwPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#withElement}.
	 * @param ctx the parse tree
	 */
	void enterWithElement(@NotNull CQLParser.WithElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#withElement}.
	 * @param ctx the parse tree
	 */
	void exitWithElement(@NotNull CQLParser.WithElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(@NotNull CQLParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(@NotNull CQLParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOf}.
	 * @param ctx the parse tree
	 */
	void enterKwOf(@NotNull CQLParser.KwOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOf}.
	 * @param ctx the parse tree
	 */
	void exitKwOf(@NotNull CQLParser.KwOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#partitionKey}.
	 * @param ctx the parse tree
	 */
	void enterPartitionKey(@NotNull CQLParser.PartitionKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#partitionKey}.
	 * @param ctx the parse tree
	 */
	void exitPartitionKey(@NotNull CQLParser.PartitionKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUsing}.
	 * @param ctx the parse tree
	 */
	void enterKwUsing(@NotNull CQLParser.KwUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUsing}.
	 * @param ctx the parse tree
	 */
	void exitKwUsing(@NotNull CQLParser.KwUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOn}.
	 * @param ctx the parse tree
	 */
	void enterKwOn(@NotNull CQLParser.KwOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOn}.
	 * @param ctx the parse tree
	 */
	void exitKwOn(@NotNull CQLParser.KwOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#cqls}.
	 * @param ctx the parse tree
	 */
	void enterCqls(@NotNull CQLParser.CqlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#cqls}.
	 * @param ctx the parse tree
	 */
	void exitCqls(@NotNull CQLParser.CqlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwNull}.
	 * @param ctx the parse tree
	 */
	void enterKwNull(@NotNull CQLParser.KwNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwNull}.
	 * @param ctx the parse tree
	 */
	void exitKwNull(@NotNull CQLParser.KwNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOr}.
	 * @param ctx the parse tree
	 */
	void enterKwOr(@NotNull CQLParser.KwOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOr}.
	 * @param ctx the parse tree
	 */
	void exitKwOr(@NotNull CQLParser.KwOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#materializedView}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedView(@NotNull CQLParser.MaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#materializedView}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedView(@NotNull CQLParser.MaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(@NotNull CQLParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(@NotNull CQLParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUse}.
	 * @param ctx the parse tree
	 */
	void enterKwUse(@NotNull CQLParser.KwUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUse}.
	 * @param ctx the parse tree
	 */
	void exitKwUse(@NotNull CQLParser.KwUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#optionHashItem}.
	 * @param ctx the parse tree
	 */
	void enterOptionHashItem(@NotNull CQLParser.OptionHashItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#optionHashItem}.
	 * @param ctx the parse tree
	 */
	void exitOptionHashItem(@NotNull CQLParser.OptionHashItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(@NotNull CQLParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(@NotNull CQLParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(@NotNull CQLParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(@NotNull CQLParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentSet}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentSet(@NotNull CQLParser.AssignmentSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentSet}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentSet(@NotNull CQLParser.AssignmentSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(@NotNull CQLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(@NotNull CQLParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#relalationContainsKey}.
	 * @param ctx the parse tree
	 */
	void enterRelalationContainsKey(@NotNull CQLParser.RelalationContainsKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#relalationContainsKey}.
	 * @param ctx the parse tree
	 */
	void exitRelalationContainsKey(@NotNull CQLParser.RelalationContainsKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinitionList(@NotNull CQLParser.ColumnDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinitionList(@NotNull CQLParser.ColumnDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(@NotNull CQLParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(@NotNull CQLParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(@NotNull CQLParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(@NotNull CQLParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondList}.
	 * @param ctx the parse tree
	 */
	void enterInitCondList(@NotNull CQLParser.InitCondListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondList}.
	 * @param ctx the parse tree
	 */
	void exitInitCondList(@NotNull CQLParser.InitCondListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#optionHashValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionHashValue(@NotNull CQLParser.OptionHashValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#optionHashValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionHashValue(@NotNull CQLParser.OptionHashValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFrom}.
	 * @param ctx the parse tree
	 */
	void enterKwFrom(@NotNull CQLParser.KwFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFrom}.
	 * @param ctx the parse tree
	 */
	void exitKwFrom(@NotNull CQLParser.KwFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#listUsers}.
	 * @param ctx the parse tree
	 */
	void enterListUsers(@NotNull CQLParser.ListUsersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#listUsers}.
	 * @param ctx the parse tree
	 */
	void exitListUsers(@NotNull CQLParser.ListUsersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwApply}.
	 * @param ctx the parse tree
	 */
	void enterKwApply(@NotNull CQLParser.KwApplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwApply}.
	 * @param ctx the parse tree
	 */
	void exitKwApply(@NotNull CQLParser.KwApplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterType}.
	 * @param ctx the parse tree
	 */
	void enterAlterType(@NotNull CQLParser.AlterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterType}.
	 * @param ctx the parse tree
	 */
	void exitAlterType(@NotNull CQLParser.AlterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#triggerClass}.
	 * @param ctx the parse tree
	 */
	void enterTriggerClass(@NotNull CQLParser.TriggerClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#triggerClass}.
	 * @param ctx the parse tree
	 */
	void exitTriggerClass(@NotNull CQLParser.TriggerClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwGrant}.
	 * @param ctx the parse tree
	 */
	void enterKwGrant(@NotNull CQLParser.KwGrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwGrant}.
	 * @param ctx the parse tree
	 */
	void exitKwGrant(@NotNull CQLParser.KwGrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexFullSpec}.
	 * @param ctx the parse tree
	 */
	void enterIndexFullSpec(@NotNull CQLParser.IndexFullSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexFullSpec}.
	 * @param ctx the parse tree
	 */
	void exitIndexFullSpec(@NotNull CQLParser.IndexFullSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxComma}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxComma(@NotNull CQLParser.SyntaxCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxComma}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxComma(@NotNull CQLParser.SyntaxCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#clusteringKey}.
	 * @param ctx the parse tree
	 */
	void enterClusteringKey(@NotNull CQLParser.ClusteringKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#clusteringKey}.
	 * @param ctx the parse tree
	 */
	void exitClusteringKey(@NotNull CQLParser.ClusteringKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnNotNull}.
	 * @param ctx the parse tree
	 */
	void enterColumnNotNull(@NotNull CQLParser.ColumnNotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnNotNull}.
	 * @param ctx the parse tree
	 */
	void exitColumnNotNull(@NotNull CQLParser.ColumnNotNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#orderSpec}.
	 * @param ctx the parse tree
	 */
	void enterOrderSpec(@NotNull CQLParser.OrderSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#orderSpec}.
	 * @param ctx the parse tree
	 */
	void exitOrderSpec(@NotNull CQLParser.OrderSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwClustering}.
	 * @param ctx the parse tree
	 */
	void enterKwClustering(@NotNull CQLParser.KwClusteringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwClustering}.
	 * @param ctx the parse tree
	 */
	void exitKwClustering(@NotNull CQLParser.KwClusteringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifSpec}.
	 * @param ctx the parse tree
	 */
	void enterIfSpec(@NotNull CQLParser.IfSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifSpec}.
	 * @param ctx the parse tree
	 */
	void exitIfSpec(@NotNull CQLParser.IfSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(@NotNull CQLParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(@NotNull CQLParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAs}.
	 * @param ctx the parse tree
	 */
	void enterKwAs(@NotNull CQLParser.KwAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAs}.
	 * @param ctx the parse tree
	 */
	void exitKwAs(@NotNull CQLParser.KwAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(@NotNull CQLParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(@NotNull CQLParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAll}.
	 * @param ctx the parse tree
	 */
	void enterKwAll(@NotNull CQLParser.KwAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAll}.
	 * @param ctx the parse tree
	 */
	void exitKwAll(@NotNull CQLParser.KwAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableWith}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableWith(@NotNull CQLParser.AlterTableWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableWith}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableWith(@NotNull CQLParser.AlterTableWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwMaterialized}.
	 * @param ctx the parse tree
	 */
	void enterKwMaterialized(@NotNull CQLParser.KwMaterializedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwMaterialized}.
	 * @param ctx the parse tree
	 */
	void exitKwMaterialized(@NotNull CQLParser.KwMaterializedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwModify}.
	 * @param ctx the parse tree
	 */
	void enterKwModify(@NotNull CQLParser.KwModifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwModify}.
	 * @param ctx the parse tree
	 */
	void exitKwModify(@NotNull CQLParser.KwModifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOptions}.
	 * @param ctx the parse tree
	 */
	void enterKwOptions(@NotNull CQLParser.KwOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOptions}.
	 * @param ctx the parse tree
	 */
	void exitKwOptions(@NotNull CQLParser.KwOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwOrder}.
	 * @param ctx the parse tree
	 */
	void enterKwOrder(@NotNull CQLParser.KwOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwOrder}.
	 * @param ctx the parse tree
	 */
	void exitKwOrder(@NotNull CQLParser.KwOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull CQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull CQLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwWhere}.
	 * @param ctx the parse tree
	 */
	void enterKwWhere(@NotNull CQLParser.KwWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwWhere}.
	 * @param ctx the parse tree
	 */
	void exitKwWhere(@NotNull CQLParser.KwWhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyDefinition(@NotNull CQLParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyDefinition(@NotNull CQLParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableDropColumnList}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropColumnList(@NotNull CQLParser.AlterTableDropColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableDropColumnList}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropColumnList(@NotNull CQLParser.AlterTableDropColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(@NotNull CQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(@NotNull CQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwInto}.
	 * @param ctx the parse tree
	 */
	void enterKwInto(@NotNull CQLParser.KwIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwInto}.
	 * @param ctx the parse tree
	 */
	void exitKwInto(@NotNull CQLParser.KwIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwReplication}.
	 * @param ctx the parse tree
	 */
	void enterKwReplication(@NotNull CQLParser.KwReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwReplication}.
	 * @param ctx the parse tree
	 */
	void exitKwReplication(@NotNull CQLParser.KwReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(@NotNull CQLParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(@NotNull CQLParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwRoles}.
	 * @param ctx the parse tree
	 */
	void enterKwRoles(@NotNull CQLParser.KwRolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwRoles}.
	 * @param ctx the parse tree
	 */
	void exitKwRoles(@NotNull CQLParser.KwRolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeRename}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeRename(@NotNull CQLParser.AlterTypeRenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeRename}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeRename(@NotNull CQLParser.AlterTypeRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#insertColumnSpec}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnSpec(@NotNull CQLParser.InsertColumnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#insertColumnSpec}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnSpec(@NotNull CQLParser.InsertColumnSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(@NotNull CQLParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(@NotNull CQLParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#beginBatch}.
	 * @param ctx the parse tree
	 */
	void enterBeginBatch(@NotNull CQLParser.BeginBatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#beginBatch}.
	 * @param ctx the parse tree
	 */
	void exitBeginBatch(@NotNull CQLParser.BeginBatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwExecute}.
	 * @param ctx the parse tree
	 */
	void enterKwExecute(@NotNull CQLParser.KwExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwExecute}.
	 * @param ctx the parse tree
	 */
	void exitKwExecute(@NotNull CQLParser.KwExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeRenameList}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeRenameList(@NotNull CQLParser.AlterTypeRenameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeRenameList}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeRenameList(@NotNull CQLParser.AlterTypeRenameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwKeyspace}.
	 * @param ctx the parse tree
	 */
	void enterKwKeyspace(@NotNull CQLParser.KwKeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwKeyspace}.
	 * @param ctx the parse tree
	 */
	void exitKwKeyspace(@NotNull CQLParser.KwKeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwPassword}.
	 * @param ctx the parse tree
	 */
	void enterKwPassword(@NotNull CQLParser.KwPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwPassword}.
	 * @param ctx the parse tree
	 */
	void exitKwPassword(@NotNull CQLParser.KwPasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketLs}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketLs(@NotNull CQLParser.SyntaxBracketLsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketLs}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketLs(@NotNull CQLParser.SyntaxBracketLsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketLr}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketLr(@NotNull CQLParser.SyntaxBracketLrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketLr}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketLr(@NotNull CQLParser.SyntaxBracketLrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwRevoke}.
	 * @param ctx the parse tree
	 */
	void enterKwRevoke(@NotNull CQLParser.KwRevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwRevoke}.
	 * @param ctx the parse tree
	 */
	void exitKwRevoke(@NotNull CQLParser.KwRevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwKeys}.
	 * @param ctx the parse tree
	 */
	void enterKwKeys(@NotNull CQLParser.KwKeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwKeys}.
	 * @param ctx the parse tree
	 */
	void exitKwKeys(@NotNull CQLParser.KwKeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(@NotNull CQLParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(@NotNull CQLParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(@NotNull CQLParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(@NotNull CQLParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#deleteColumnList}.
	 * @param ctx the parse tree
	 */
	void enterDeleteColumnList(@NotNull CQLParser.DeleteColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#deleteColumnList}.
	 * @param ctx the parse tree
	 */
	void exitDeleteColumnList(@NotNull CQLParser.DeleteColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull CQLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull CQLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwLanguage}.
	 * @param ctx the parse tree
	 */
	void enterKwLanguage(@NotNull CQLParser.KwLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwLanguage}.
	 * @param ctx the parse tree
	 */
	void exitKwLanguage(@NotNull CQLParser.KwLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(@NotNull CQLParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(@NotNull CQLParser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwReturns}.
	 * @param ctx the parse tree
	 */
	void enterKwReturns(@NotNull CQLParser.KwReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwReturns}.
	 * @param ctx the parse tree
	 */
	void exitKwReturns(@NotNull CQLParser.KwReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createKeyspace}.
	 * @param ctx the parse tree
	 */
	void enterCreateKeyspace(@NotNull CQLParser.CreateKeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createKeyspace}.
	 * @param ctx the parse tree
	 */
	void exitCreateKeyspace(@NotNull CQLParser.CreateKeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#durableWrites}.
	 * @param ctx the parse tree
	 */
	void enterDurableWrites(@NotNull CQLParser.DurableWritesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#durableWrites}.
	 * @param ctx the parse tree
	 */
	void exitDurableWrites(@NotNull CQLParser.DurableWritesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAnd}.
	 * @param ctx the parse tree
	 */
	void enterKwAnd(@NotNull CQLParser.KwAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAnd}.
	 * @param ctx the parse tree
	 */
	void exitKwAnd(@NotNull CQLParser.KwAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwBy}.
	 * @param ctx the parse tree
	 */
	void enterKwBy(@NotNull CQLParser.KwByContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwBy}.
	 * @param ctx the parse tree
	 */
	void exitKwBy(@NotNull CQLParser.KwByContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull CQLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull CQLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull CQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull CQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaterializedView(@NotNull CQLParser.CreateMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaterializedView(@NotNull CQLParser.CreateMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUpdate}.
	 * @param ctx the parse tree
	 */
	void enterKwUpdate(@NotNull CQLParser.KwUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUpdate}.
	 * @param ctx the parse tree
	 */
	void exitKwUpdate(@NotNull CQLParser.KwUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondHash}.
	 * @param ctx the parse tree
	 */
	void enterInitCondHash(@NotNull CQLParser.InitCondHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondHash}.
	 * @param ctx the parse tree
	 */
	void exitInitCondHash(@NotNull CQLParser.InitCondHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(@NotNull CQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(@NotNull CQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwSuperuser}.
	 * @param ctx the parse tree
	 */
	void enterKwSuperuser(@NotNull CQLParser.KwSuperuserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwSuperuser}.
	 * @param ctx the parse tree
	 */
	void exitKwSuperuser(@NotNull CQLParser.KwSuperuserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dataTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDefinition(@NotNull CQLParser.DataTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dataTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDefinition(@NotNull CQLParser.DataTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropAggregate}.
	 * @param ctx the parse tree
	 */
	void enterDropAggregate(@NotNull CQLParser.DropAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropAggregate}.
	 * @param ctx the parse tree
	 */
	void exitDropAggregate(@NotNull CQLParser.DropAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#singlePrimaryKey}.
	 * @param ctx the parse tree
	 */
	void enterSinglePrimaryKey(@NotNull CQLParser.SinglePrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#singlePrimaryKey}.
	 * @param ctx the parse tree
	 */
	void exitSinglePrimaryKey(@NotNull CQLParser.SinglePrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#listRoles}.
	 * @param ctx the parse tree
	 */
	void enterListRoles(@NotNull CQLParser.ListRolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#listRoles}.
	 * @param ctx the parse tree
	 */
	void exitListRoles(@NotNull CQLParser.ListRolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropType}.
	 * @param ctx the parse tree
	 */
	void enterDropType(@NotNull CQLParser.DropTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropType}.
	 * @param ctx the parse tree
	 */
	void exitDropType(@NotNull CQLParser.DropTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#keyspace}.
	 * @param ctx the parse tree
	 */
	void enterKeyspace(@NotNull CQLParser.KeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#keyspace}.
	 * @param ctx the parse tree
	 */
	void exitKeyspace(@NotNull CQLParser.KeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#roleWithOptions}.
	 * @param ctx the parse tree
	 */
	void enterRoleWithOptions(@NotNull CQLParser.RoleWithOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#roleWithOptions}.
	 * @param ctx the parse tree
	 */
	void exitRoleWithOptions(@NotNull CQLParser.RoleWithOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwLogin}.
	 * @param ctx the parse tree
	 */
	void enterKwLogin(@NotNull CQLParser.KwLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwLogin}.
	 * @param ctx the parse tree
	 */
	void exitKwLogin(@NotNull CQLParser.KwLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketLc}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketLc(@NotNull CQLParser.SyntaxBracketLcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketLc}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketLc(@NotNull CQLParser.SyntaxBracketLcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondListNested}.
	 * @param ctx the parse tree
	 */
	void enterInitCondListNested(@NotNull CQLParser.InitCondListNestedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondListNested}.
	 * @param ctx the parse tree
	 */
	void exitInitCondListNested(@NotNull CQLParser.InitCondListNestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#replicationListItem}.
	 * @param ctx the parse tree
	 */
	void enterReplicationListItem(@NotNull CQLParser.ReplicationListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#replicationListItem}.
	 * @param ctx the parse tree
	 */
	void exitReplicationListItem(@NotNull CQLParser.ReplicationListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketLa}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketLa(@NotNull CQLParser.SyntaxBracketLaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketLa}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketLa(@NotNull CQLParser.SyntaxBracketLaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#optionHash}.
	 * @param ctx the parse tree
	 */
	void enterOptionHash(@NotNull CQLParser.OptionHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#optionHash}.
	 * @param ctx the parse tree
	 */
	void exitOptionHash(@NotNull CQLParser.OptionHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifConditionList}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionList(@NotNull CQLParser.IfConditionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifConditionList}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionList(@NotNull CQLParser.IfConditionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTtl}.
	 * @param ctx the parse tree
	 */
	void enterKwTtl(@NotNull CQLParser.KwTtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTtl}.
	 * @param ctx the parse tree
	 */
	void exitKwTtl(@NotNull CQLParser.KwTtlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(@NotNull CQLParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(@NotNull CQLParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAuthorize}.
	 * @param ctx the parse tree
	 */
	void enterKwAuthorize(@NotNull CQLParser.KwAuthorizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAuthorize}.
	 * @param ctx the parse tree
	 */
	void exitKwAuthorize(@NotNull CQLParser.KwAuthorizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(@NotNull CQLParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(@NotNull CQLParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTrigger}.
	 * @param ctx the parse tree
	 */
	void enterKwTrigger(@NotNull CQLParser.KwTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTrigger}.
	 * @param ctx the parse tree
	 */
	void exitKwTrigger(@NotNull CQLParser.KwTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(@NotNull CQLParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(@NotNull CQLParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull CQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull CQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 */
	void enterDropMaterializedView(@NotNull CQLParser.DropMaterializedViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 */
	void exitDropMaterializedView(@NotNull CQLParser.DropMaterializedViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(@NotNull CQLParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(@NotNull CQLParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketRs}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketRs(@NotNull CQLParser.SyntaxBracketRsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketRs}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketRs(@NotNull CQLParser.SyntaxBracketRsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketRr}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketRr(@NotNull CQLParser.SyntaxBracketRrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketRr}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketRr(@NotNull CQLParser.SyntaxBracketRrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(@NotNull CQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(@NotNull CQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CQLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CQLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(@NotNull CQLParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(@NotNull CQLParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#compoundKey}.
	 * @param ctx the parse tree
	 */
	void enterCompoundKey(@NotNull CQLParser.CompoundKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#compoundKey}.
	 * @param ctx the parse tree
	 */
	void exitCompoundKey(@NotNull CQLParser.CompoundKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwReplace}.
	 * @param ctx the parse tree
	 */
	void enterKwReplace(@NotNull CQLParser.KwReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwReplace}.
	 * @param ctx the parse tree
	 */
	void exitKwReplace(@NotNull CQLParser.KwReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#truncate}.
	 * @param ctx the parse tree
	 */
	void enterTruncate(@NotNull CQLParser.TruncateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#truncate}.
	 * @param ctx the parse tree
	 */
	void exitTruncate(@NotNull CQLParser.TruncateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAlter}.
	 * @param ctx the parse tree
	 */
	void enterKwAlter(@NotNull CQLParser.KwAlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAlter}.
	 * @param ctx the parse tree
	 */
	void exitKwAlter(@NotNull CQLParser.KwAlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDistinct}.
	 * @param ctx the parse tree
	 */
	void enterKwDistinct(@NotNull CQLParser.KwDistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDistinct}.
	 * @param ctx the parse tree
	 */
	void exitKwDistinct(@NotNull CQLParser.KwDistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#whereSpec}.
	 * @param ctx the parse tree
	 */
	void enterWhereSpec(@NotNull CQLParser.WhereSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#whereSpec}.
	 * @param ctx the parse tree
	 */
	void exitWhereSpec(@NotNull CQLParser.WhereSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwWith}.
	 * @param ctx the parse tree
	 */
	void enterKwWith(@NotNull CQLParser.KwWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwWith}.
	 * @param ctx the parse tree
	 */
	void exitKwWith(@NotNull CQLParser.KwWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableColumnDefinition(@NotNull CQLParser.AlterTableColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableColumnDefinition(@NotNull CQLParser.AlterTableColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwContains}.
	 * @param ctx the parse tree
	 */
	void enterKwContains(@NotNull CQLParser.KwContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwContains}.
	 * @param ctx the parse tree
	 */
	void exitKwContains(@NotNull CQLParser.KwContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwEntries}.
	 * @param ctx the parse tree
	 */
	void enterKwEntries(@NotNull CQLParser.KwEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwEntries}.
	 * @param ctx the parse tree
	 */
	void exitKwEntries(@NotNull CQLParser.KwEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#materializedViewWhere}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedViewWhere(@NotNull CQLParser.MaterializedViewWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#materializedViewWhere}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedViewWhere(@NotNull CQLParser.MaterializedViewWhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUnlogged}.
	 * @param ctx the parse tree
	 */
	void enterKwUnlogged(@NotNull CQLParser.KwUnloggedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUnlogged}.
	 * @param ctx the parse tree
	 */
	void exitKwUnlogged(@NotNull CQLParser.KwUnloggedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#materializedViewOptions}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedViewOptions(@NotNull CQLParser.MaterializedViewOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#materializedViewOptions}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedViewOptions(@NotNull CQLParser.MaterializedViewOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwJson}.
	 * @param ctx the parse tree
	 */
	void enterKwJson(@NotNull CQLParser.KwJsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwJson}.
	 * @param ctx the parse tree
	 */
	void exitKwJson(@NotNull CQLParser.KwJsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeRenameItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeRenameItem(@NotNull CQLParser.AlterTypeRenameItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeRenameItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeRenameItem(@NotNull CQLParser.AlterTypeRenameItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull CQLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull CQLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTo}.
	 * @param ctx the parse tree
	 */
	void enterKwTo(@NotNull CQLParser.KwToContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTo}.
	 * @param ctx the parse tree
	 */
	void exitKwTo(@NotNull CQLParser.KwToContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#orReplace}.
	 * @param ctx the parse tree
	 */
	void enterOrReplace(@NotNull CQLParser.OrReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#orReplace}.
	 * @param ctx the parse tree
	 */
	void exitOrReplace(@NotNull CQLParser.OrReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull CQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull CQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketRc}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketRc(@NotNull CQLParser.SyntaxBracketRcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketRc}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketRc(@NotNull CQLParser.SyntaxBracketRcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentTuple}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentTuple(@NotNull CQLParser.AssignmentTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentTuple}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentTuple(@NotNull CQLParser.AssignmentTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxBracketRa}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxBracketRa(@NotNull CQLParser.SyntaxBracketRaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxBracketRa}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxBracketRa(@NotNull CQLParser.SyntaxBracketRaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createAggregate}.
	 * @param ctx the parse tree
	 */
	void enterCreateAggregate(@NotNull CQLParser.CreateAggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createAggregate}.
	 * @param ctx the parse tree
	 */
	void exitCreateAggregate(@NotNull CQLParser.CreateAggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDrop}.
	 * @param ctx the parse tree
	 */
	void enterKwDrop(@NotNull CQLParser.KwDropContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDrop}.
	 * @param ctx the parse tree
	 */
	void exitKwDrop(@NotNull CQLParser.KwDropContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#userPassword}.
	 * @param ctx the parse tree
	 */
	void enterUserPassword(@NotNull CQLParser.UserPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#userPassword}.
	 * @param ctx the parse tree
	 */
	void exitUserPassword(@NotNull CQLParser.UserPasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#returnMode}.
	 * @param ctx the parse tree
	 */
	void enterReturnMode(@NotNull CQLParser.ReturnModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#returnMode}.
	 * @param ctx the parse tree
	 */
	void exitReturnMode(@NotNull CQLParser.ReturnModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFunctions}.
	 * @param ctx the parse tree
	 */
	void enterKwFunctions(@NotNull CQLParser.KwFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFunctions}.
	 * @param ctx the parse tree
	 */
	void exitKwFunctions(@NotNull CQLParser.KwFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwIndex}.
	 * @param ctx the parse tree
	 */
	void enterKwIndex(@NotNull CQLParser.KwIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwIndex}.
	 * @param ctx the parse tree
	 */
	void exitKwIndex(@NotNull CQLParser.KwIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwKey}.
	 * @param ctx the parse tree
	 */
	void enterKwKey(@NotNull CQLParser.KwKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwKey}.
	 * @param ctx the parse tree
	 */
	void exitKwKey(@NotNull CQLParser.KwKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwRole}.
	 * @param ctx the parse tree
	 */
	void enterKwRole(@NotNull CQLParser.KwRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwRole}.
	 * @param ctx the parse tree
	 */
	void exitKwRole(@NotNull CQLParser.KwRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#fromSpec}.
	 * @param ctx the parse tree
	 */
	void enterFromSpec(@NotNull CQLParser.FromSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#fromSpec}.
	 * @param ctx the parse tree
	 */
	void exitFromSpec(@NotNull CQLParser.FromSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwSet}.
	 * @param ctx the parse tree
	 */
	void enterKwSet(@NotNull CQLParser.KwSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwSet}.
	 * @param ctx the parse tree
	 */
	void exitKwSet(@NotNull CQLParser.KwSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#clusteringOrder}.
	 * @param ctx the parse tree
	 */
	void enterClusteringOrder(@NotNull CQLParser.ClusteringOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#clusteringOrder}.
	 * @param ctx the parse tree
	 */
	void exitClusteringOrder(@NotNull CQLParser.ClusteringOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDurableWrites}.
	 * @param ctx the parse tree
	 */
	void enterKwDurableWrites(@NotNull CQLParser.KwDurableWritesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDurableWrites}.
	 * @param ctx the parse tree
	 */
	void exitKwDurableWrites(@NotNull CQLParser.KwDurableWritesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFinalfunc}.
	 * @param ctx the parse tree
	 */
	void enterKwFinalfunc(@NotNull CQLParser.KwFinalfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFinalfunc}.
	 * @param ctx the parse tree
	 */
	void exitKwFinalfunc(@NotNull CQLParser.KwFinalfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#typeMemberColumnList}.
	 * @param ctx the parse tree
	 */
	void enterTypeMemberColumnList(@NotNull CQLParser.TypeMemberColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#typeMemberColumnList}.
	 * @param ctx the parse tree
	 */
	void exitTypeMemberColumnList(@NotNull CQLParser.TypeMemberColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(@NotNull CQLParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(@NotNull CQLParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifExist}.
	 * @param ctx the parse tree
	 */
	void enterIfExist(@NotNull CQLParser.IfExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifExist}.
	 * @param ctx the parse tree
	 */
	void exitIfExist(@NotNull CQLParser.IfExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull CQLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull CQLParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDesc}.
	 * @param ctx the parse tree
	 */
	void enterKwDesc(@NotNull CQLParser.KwDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDesc}.
	 * @param ctx the parse tree
	 */
	void exitKwDesc(@NotNull CQLParser.KwDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFull}.
	 * @param ctx the parse tree
	 */
	void enterKwFull(@NotNull CQLParser.KwFullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFull}.
	 * @param ctx the parse tree
	 */
	void exitKwFull(@NotNull CQLParser.KwFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#userSuperUser}.
	 * @param ctx the parse tree
	 */
	void enterUserSuperUser(@NotNull CQLParser.UserSuperUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#userSuperUser}.
	 * @param ctx the parse tree
	 */
	void exitUserSuperUser(@NotNull CQLParser.UserSuperUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(@NotNull CQLParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(@NotNull CQLParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwCreate}.
	 * @param ctx the parse tree
	 */
	void enterKwCreate(@NotNull CQLParser.KwCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwCreate}.
	 * @param ctx the parse tree
	 */
	void exitKwCreate(@NotNull CQLParser.KwCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDescibe}.
	 * @param ctx the parse tree
	 */
	void enterKwDescibe(@NotNull CQLParser.KwDescibeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDescibe}.
	 * @param ctx the parse tree
	 */
	void exitKwDescibe(@NotNull CQLParser.KwDescibeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(@NotNull CQLParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(@NotNull CQLParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#trigger}.
	 * @param ctx the parse tree
	 */
	void enterTrigger(@NotNull CQLParser.TriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#trigger}.
	 * @param ctx the parse tree
	 */
	void exitTrigger(@NotNull CQLParser.TriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwList}.
	 * @param ctx the parse tree
	 */
	void enterKwList(@NotNull CQLParser.KwListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwList}.
	 * @param ctx the parse tree
	 */
	void exitKwList(@NotNull CQLParser.KwListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentMap}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentMap(@NotNull CQLParser.AssignmentMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentMap}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentMap(@NotNull CQLParser.AssignmentMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#relationElement}.
	 * @param ctx the parse tree
	 */
	void enterRelationElement(@NotNull CQLParser.RelationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#relationElement}.
	 * @param ctx the parse tree
	 */
	void exitRelationElement(@NotNull CQLParser.RelationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableOptionName}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionName(@NotNull CQLParser.TableOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableOptionName}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionName(@NotNull CQLParser.TableOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(@NotNull CQLParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(@NotNull CQLParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwView}.
	 * @param ctx the parse tree
	 */
	void enterKwView(@NotNull CQLParser.KwViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwView}.
	 * @param ctx the parse tree
	 */
	void exitKwView(@NotNull CQLParser.KwViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAsc}.
	 * @param ctx the parse tree
	 */
	void enterKwAsc(@NotNull CQLParser.KwAscContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAsc}.
	 * @param ctx the parse tree
	 */
	void exitKwAsc(@NotNull CQLParser.KwAscContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterKwTimestamp(@NotNull CQLParser.KwTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitKwTimestamp(@NotNull CQLParser.KwTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwBegin}.
	 * @param ctx the parse tree
	 */
	void enterKwBegin(@NotNull CQLParser.KwBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwBegin}.
	 * @param ctx the parse tree
	 */
	void exitKwBegin(@NotNull CQLParser.KwBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull CQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull CQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwIn}.
	 * @param ctx the parse tree
	 */
	void enterKwIn(@NotNull CQLParser.KwInContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwIn}.
	 * @param ctx the parse tree
	 */
	void exitKwIn(@NotNull CQLParser.KwInContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwIs}.
	 * @param ctx the parse tree
	 */
	void enterKwIs(@NotNull CQLParser.KwIsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwIs}.
	 * @param ctx the parse tree
	 */
	void exitKwIs(@NotNull CQLParser.KwIsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(@NotNull CQLParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(@NotNull CQLParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#compositeKey}.
	 * @param ctx the parse tree
	 */
	void enterCompositeKey(@NotNull CQLParser.CompositeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#compositeKey}.
	 * @param ctx the parse tree
	 */
	void exitCompositeKey(@NotNull CQLParser.CompositeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(@NotNull CQLParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(@NotNull CQLParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwType}.
	 * @param ctx the parse tree
	 */
	void enterKwType(@NotNull CQLParser.KwTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwType}.
	 * @param ctx the parse tree
	 */
	void exitKwType(@NotNull CQLParser.KwTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAdd}.
	 * @param ctx the parse tree
	 */
	void enterKwAdd(@NotNull CQLParser.KwAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAdd}.
	 * @param ctx the parse tree
	 */
	void exitKwAdd(@NotNull CQLParser.KwAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(@NotNull CQLParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(@NotNull CQLParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull CQLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull CQLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(@NotNull CQLParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(@NotNull CQLParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwIf}.
	 * @param ctx the parse tree
	 */
	void enterKwIf(@NotNull CQLParser.KwIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwIf}.
	 * @param ctx the parse tree
	 */
	void exitKwIf(@NotNull CQLParser.KwIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull CQLParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull CQLParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#primaryKeyElement}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyElement(@NotNull CQLParser.PrimaryKeyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#primaryKeyElement}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyElement(@NotNull CQLParser.PrimaryKeyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(@NotNull CQLParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(@NotNull CQLParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTypeAdd}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeAdd(@NotNull CQLParser.AlterTypeAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTypeAdd}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeAdd(@NotNull CQLParser.AlterTypeAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(@NotNull CQLParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(@NotNull CQLParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwSfunc}.
	 * @param ctx the parse tree
	 */
	void enterKwSfunc(@NotNull CQLParser.KwSfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwSfunc}.
	 * @param ctx the parse tree
	 */
	void exitKwSfunc(@NotNull CQLParser.KwSfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterRole(@NotNull CQLParser.AlterRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterRole(@NotNull CQLParser.AlterRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#priviledge}.
	 * @param ctx the parse tree
	 */
	void enterPriviledge(@NotNull CQLParser.PriviledgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#priviledge}.
	 * @param ctx the parse tree
	 */
	void exitPriviledge(@NotNull CQLParser.PriviledgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#fromSpecElement}.
	 * @param ctx the parse tree
	 */
	void enterFromSpecElement(@NotNull CQLParser.FromSpecElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#fromSpecElement}.
	 * @param ctx the parse tree
	 */
	void exitFromSpecElement(@NotNull CQLParser.FromSpecElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#relationElements}.
	 * @param ctx the parse tree
	 */
	void enterRelationElements(@NotNull CQLParser.RelationElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#relationElements}.
	 * @param ctx the parse tree
	 */
	void exitRelationElements(@NotNull CQLParser.RelationElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInitCondDefinition(@NotNull CQLParser.InitCondDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInitCondDefinition(@NotNull CQLParser.InitCondDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(@NotNull CQLParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(@NotNull CQLParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexColumnSpec}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnSpec(@NotNull CQLParser.IndexColumnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexColumnSpec}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnSpec(@NotNull CQLParser.IndexColumnSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(@NotNull CQLParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(@NotNull CQLParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#initCondHashItem}.
	 * @param ctx the parse tree
	 */
	void enterInitCondHashItem(@NotNull CQLParser.InitCondHashItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#initCondHashItem}.
	 * @param ctx the parse tree
	 */
	void exitInitCondHashItem(@NotNull CQLParser.InitCondHashItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#optionHashKey}.
	 * @param ctx the parse tree
	 */
	void enterOptionHashKey(@NotNull CQLParser.OptionHashKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#optionHashKey}.
	 * @param ctx the parse tree
	 */
	void exitOptionHashKey(@NotNull CQLParser.OptionHashKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwInsert}.
	 * @param ctx the parse tree
	 */
	void enterKwInsert(@NotNull CQLParser.KwInsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwInsert}.
	 * @param ctx the parse tree
	 */
	void exitKwInsert(@NotNull CQLParser.KwInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(@NotNull CQLParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(@NotNull CQLParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#cql}.
	 * @param ctx the parse tree
	 */
	void enterCql(@NotNull CQLParser.CqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#cql}.
	 * @param ctx the parse tree
	 */
	void exitCql(@NotNull CQLParser.CqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(@NotNull CQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(@NotNull CQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#dropKeyspace}.
	 * @param ctx the parse tree
	 */
	void enterDropKeyspace(@NotNull CQLParser.DropKeyspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#dropKeyspace}.
	 * @param ctx the parse tree
	 */
	void exitDropKeyspace(@NotNull CQLParser.DropKeyspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwValues}.
	 * @param ctx the parse tree
	 */
	void enterKwValues(@NotNull CQLParser.KwValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwValues}.
	 * @param ctx the parse tree
	 */
	void exitKwValues(@NotNull CQLParser.KwValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull CQLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull CQLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#createType}.
	 * @param ctx the parse tree
	 */
	void enterCreateType(@NotNull CQLParser.CreateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#createType}.
	 * @param ctx the parse tree
	 */
	void exitCreateType(@NotNull CQLParser.CreateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#primaryKeyColumn}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumn(@NotNull CQLParser.PrimaryKeyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#primaryKeyColumn}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumn(@NotNull CQLParser.PrimaryKeyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull CQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull CQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(@NotNull CQLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(@NotNull CQLParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFunction}.
	 * @param ctx the parse tree
	 */
	void enterKwFunction(@NotNull CQLParser.KwFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFunction}.
	 * @param ctx the parse tree
	 */
	void exitKwFunction(@NotNull CQLParser.KwFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwUsers}.
	 * @param ctx the parse tree
	 */
	void enterKwUsers(@NotNull CQLParser.KwUsersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwUsers}.
	 * @param ctx the parse tree
	 */
	void exitKwUsers(@NotNull CQLParser.KwUsersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwAllPermissions}.
	 * @param ctx the parse tree
	 */
	void enterKwAllPermissions(@NotNull CQLParser.KwAllPermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwAllPermissions}.
	 * @param ctx the parse tree
	 */
	void exitKwAllPermissions(@NotNull CQLParser.KwAllPermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#listPermissions}.
	 * @param ctx the parse tree
	 */
	void enterListPermissions(@NotNull CQLParser.ListPermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#listPermissions}.
	 * @param ctx the parse tree
	 */
	void exitListPermissions(@NotNull CQLParser.ListPermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwDelete}.
	 * @param ctx the parse tree
	 */
	void enterKwDelete(@NotNull CQLParser.KwDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwDelete}.
	 * @param ctx the parse tree
	 */
	void exitKwDelete(@NotNull CQLParser.KwDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwTable}.
	 * @param ctx the parse tree
	 */
	void enterKwTable(@NotNull CQLParser.KwTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwTable}.
	 * @param ctx the parse tree
	 */
	void exitKwTable(@NotNull CQLParser.KwTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwNot}.
	 * @param ctx the parse tree
	 */
	void enterKwNot(@NotNull CQLParser.KwNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwNot}.
	 * @param ctx the parse tree
	 */
	void exitKwNot(@NotNull CQLParser.KwNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwInitcond}.
	 * @param ctx the parse tree
	 */
	void enterKwInitcond(@NotNull CQLParser.KwInitcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwInitcond}.
	 * @param ctx the parse tree
	 */
	void exitKwInitcond(@NotNull CQLParser.KwInitcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#applyBatch}.
	 * @param ctx the parse tree
	 */
	void enterApplyBatch(@NotNull CQLParser.ApplyBatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#applyBatch}.
	 * @param ctx the parse tree
	 */
	void exitApplyBatch(@NotNull CQLParser.ApplyBatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwNorecursive}.
	 * @param ctx the parse tree
	 */
	void enterKwNorecursive(@NotNull CQLParser.KwNorecursiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwNorecursive}.
	 * @param ctx the parse tree
	 */
	void exitKwNorecursive(@NotNull CQLParser.KwNorecursiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableOptionItem}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionItem(@NotNull CQLParser.TableOptionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableOptionItem}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionItem(@NotNull CQLParser.TableOptionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#usingTtlTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterUsingTtlTimestamp(@NotNull CQLParser.UsingTtlTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#usingTtlTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitUsingTtlTimestamp(@NotNull CQLParser.UsingTtlTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#hashKey}.
	 * @param ctx the parse tree
	 */
	void enterHashKey(@NotNull CQLParser.HashKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#hashKey}.
	 * @param ctx the parse tree
	 */
	void exitHashKey(@NotNull CQLParser.HashKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#partitionKeyList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionKeyList(@NotNull CQLParser.PartitionKeyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#partitionKeyList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionKeyList(@NotNull CQLParser.PartitionKeyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ifNotExist}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExist(@NotNull CQLParser.IfNotExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ifNotExist}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExist(@NotNull CQLParser.IfNotExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#statementSeparator}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeparator(@NotNull CQLParser.StatementSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#statementSeparator}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeparator(@NotNull CQLParser.StatementSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#ttl}.
	 * @param ctx the parse tree
	 */
	void enterTtl(@NotNull CQLParser.TtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#ttl}.
	 * @param ctx the parse tree
	 */
	void exitTtl(@NotNull CQLParser.TtlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#limitSpec}.
	 * @param ctx the parse tree
	 */
	void enterLimitSpec(@NotNull CQLParser.LimitSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#limitSpec}.
	 * @param ctx the parse tree
	 */
	void exitLimitSpec(@NotNull CQLParser.LimitSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#syntaxColon}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxColon(@NotNull CQLParser.SyntaxColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#syntaxColon}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxColon(@NotNull CQLParser.SyntaxColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#indexKeysSpec}.
	 * @param ctx the parse tree
	 */
	void enterIndexKeysSpec(@NotNull CQLParser.IndexKeysSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#indexKeysSpec}.
	 * @param ctx the parse tree
	 */
	void exitIndexKeysSpec(@NotNull CQLParser.IndexKeysSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(@NotNull CQLParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(@NotNull CQLParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#kwFiltering}.
	 * @param ctx the parse tree
	 */
	void enterKwFiltering(@NotNull CQLParser.KwFilteringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#kwFiltering}.
	 * @param ctx the parse tree
	 */
	void exitKwFiltering(@NotNull CQLParser.KwFilteringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#clusteringKeyList}.
	 * @param ctx the parse tree
	 */
	void enterClusteringKeyList(@NotNull CQLParser.ClusteringKeyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#clusteringKeyList}.
	 * @param ctx the parse tree
	 */
	void exitClusteringKeyList(@NotNull CQLParser.ClusteringKeyListContext ctx);
}