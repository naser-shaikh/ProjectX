package com.projectx.projectx.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.projectx.projectx.R;
import com.projectx.projectx.models.ExpenseInfoModel;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;
import org.w3c.dom.Text;

/**
 * Created by nshaikh on 2/9/2016.
 */
@EViewGroup(R.layout.item_group_expense_list)
public class ExpenseInfoView extends LinearLayout {

    @ViewById(R.id.txtItmGroupHomeExpenseName)
    TextView txtExpenseName;

    @ViewById(R.id.txtItmGroupHomeExpenseDetails)
    TextView txtExpenseDetails;

    public ExpenseInfoView(Context context) {
        super(context);
    }

    public void bind(ExpenseInfoModel model){
        txtExpenseName.setText(model.getExpenseName());
        txtExpenseDetails.setText(model.getExpenseDetails());
    }

}
