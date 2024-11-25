package com.rey.aplikasikeuangan3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {

    private RecyclerView recyclerView;
    private TransactionAdapter transactionAdapter;

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Set up the adapter for the transaction list (using a sample list here)
        transactionAdapter = new TransactionAdapter(getSampleTransactionData());
        recyclerView.setAdapter(transactionAdapter);

        return view;
    }

    // Sample data for demonstration
    private List<Transaction> getSampleTransactionData() {
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("Top-up", "Rp 100.000", "2024-11-20"));
        transactionList.add(new Transaction("Kirim uang", "Rp 50.000", "2024-11-21"));
        transactionList.add(new Transaction("Top-up", "Rp 10.000", "2024-11-20"));
        transactionList.add(new Transaction("Kirim uang", "Rp 30.000", "2024-11-21"));
        transactionList.add(new Transaction("Top-up", "Rp 100.000", "2024-11-20"));
        transactionList.add(new Transaction("Kirim uang", "Rp 50.000", "2024-11-21"));
        transactionList.add(new Transaction("Top-up", "Rp 100.000", "2024-11-20"));
        transactionList.add(new Transaction("Kirim uang", "Rp 50.000", "2024-11-21"));
        transactionList.add(new Transaction("Top-up", "Rp 100.000", "2024-11-20"));
        transactionList.add(new Transaction("Kirim uang", "Rp 50.000", "2024-11-21"));
        transactionList.add(new Transaction("Top-up", "Rp 100.000", "2024-11-20"));
        transactionList.add(new Transaction("Kirim uang", "Rp 50.000", "2024-11-21"));
        transactionList.add(new Transaction("Top-up", "Rp 100.000", "2024-11-20"));
        transactionList.add(new Transaction("Kirim uang", "Rp 50.000", "2024-11-21"));
        transactionList.add(new Transaction("Top-up", "Rp 100.000", "2024-11-20"));
        transactionList.add(new Transaction("Kirim uang", "Rp 50.000", "2024-11-21"));
        // Add more sample transactions as needed
        return transactionList;
    }
}
