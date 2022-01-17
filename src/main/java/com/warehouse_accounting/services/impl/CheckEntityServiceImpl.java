package com.warehouse_accounting.services.impl;

import com.warehouse_accounting.exceptions.NotFoundEntityException;
import com.warehouse_accounting.services.interfaces.CheckEntityService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor

public class CheckEntityServiceImpl implements CheckEntityService {
    @Override
    public void checkExist(Long id, JpaRepository repository, String objectName) {
        if(!repository.existsById(id)) {
            throw new NotFoundEntityException(objectName + " с id=" + id + " не найден");
        }
    }

    @Override
    public void checkExistUnitById(Long unitId) {

    }

    @Override
    public void checkExistAttributeOfCalculationObjectById(Long attributeOfCalculationObjectId) {

    }

    @Override
    public void checkExistCompanyById(Long companyId) {

    }

    @Override
    public void checkExistBankAccountById(Long bankAccountId) {

    }

    @Override
    public void checkExistContractorGroupById(Long contractorGroupId) {

    }

    @Override
    public void checkExistContractById(Long contractId) {

    }

    @Override
    public void checkExistCurrencyById(Long currencyId) {

    }

    @Override
    public void checkExistDepartmentById(Long departmentId) {

    }

    @Override
    public void checkExistImageById(Long imageId) {

    }

    @Override
    public void checkExistLegalDetailById(Long legalDetailId) {

    }

    @Override
    public void checkExistPositionById(Long positionId) {

    }

    @Override
    public void checkExistRoleById(Long roleId) {

    }

    @Override
    public void checkExistTaxSystemById(Long taxSystemId) {

    }

    @Override
    public void checkExistTypeOfContractorById(Long typeOfContractorId) {

    }

    @Override
    public void checkExistTypeOfPriceById(Long typeOfPriceId) {

    }

    @Override
    public void checkExistWarehouseById(Long warehouseId) {

    }

    @Override
    public void checkExistEmployeeById(Long employeeId) {

    }

    @Override
    public void checkExistProductGroupById(Long productGroupID) {

    }

    @Override
    public void checkExistContractorById(Long contractorId) {

    }

    @Override
    public void checkExistMovementById(Long contractorId) {

    }

    @Override
    public void checkExistInvoiceById(Long invoiceId) {

    }

    @Override
    public void checkExistInvoiceProductById(Long invoiceProductId) {

    }

    @Override
    public void checkExistPaymentById(Long PaymentId) {

    }

    @Override
    public void checkExistProjectById(Long projectId) {

    }

    @Override
    public void checkExistProductById(Long productId) {

    }

    @Override
    public void checkExistProductPriceById(Long productPriceId) {

    }

    @Override
    public void checkExistTechnologicalOperationById(Long technologicalOperationId) {

    }

    @Override
    public void checkExistProductionOrderById(Long productionOrderId) {

    }

    @Override
    public void checkExistCountryById(Long countryId) {

    }

    @Override
    public void checkExistTechnologicalMapById(Long invoiceId) {

    }

    @Override
    public void checkExistTechnologicalMapGroupById(Long invoiceId) {

    }

    @Override
    public void checkExistTechnologicalMapProductById(Long invoiceId) {

    }

    @Override
    public void checkExistTechnologicalMapMaterialById(Long invoiceId) {

    }

    @Override
    public void checkExistCallById(Long CallId) {

    }

    @Override
    public void checkExistTaskById(Long TaskId) {

    }

    @Override
    public void checkExistAdjustmentById(Long adjustmentId) {

    }

    @Override
    public void checkExistMemoById(Long memoId) {

    }

    @Override
    public void checkExistTariffById(Long tariffId) {

    }

    @Override
    public void checkExistRequisitesById(Long requisitesId) {

    }

    @Override
    public void checkExistSubscriptionById(Long subscriptionId) {

    }

    @Override
    public void checkExistFeedById(Long feedId) {

    }

    @Override
    public void checkExistBonusTransactionById(Long bonusTransactionId) {

    }

    @Override
    public void checkExistApplicationById(Long id) {

    }

    @Override
    public void checkExistSettingsById(Long settingsId) {

    }

    @Override
    public void checkExistLanguageById(Long settingsId) {

    }

    @Override
    public void checkExistPrintingDocumentsById(Long printingDocumentsId) {

    }

    @Override
    public void checkExistStartScreenById(Long startScreenId) {

    }

    @Override
    public void checkExistNotificationsById(Long notificationsId) {

    }

    @Override
    public void checkExistSelectorById(Long selectorId) {

    }

}