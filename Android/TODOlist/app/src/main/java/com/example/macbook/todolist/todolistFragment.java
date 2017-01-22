package com.example.macbook.todolist;

import android.app.Fragment;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.ViewGroupCompat;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class todolistFragment extends Fragment implements LoaderManager.LoaderCallbacks<Cursor>{


    public static final String LOG_TAG = todolistFragment.class.getSimpleName();

    private ListView mListView;
    private int mPosition = ListView.INVALID_POSITION;
    private boolean mUseTodayLayout;
    private todoListAdapter mTodoListAdapter;

    private static final String SELECTED_KEY = "selected_key";
    private static final String[] TODOLIST_COLUMNS ={
        //데이터 베이스 값 할당부
    };

    /*
        데이터 베이스 값 할당부, 인덱
    */


    /*
     * A callback interface that all activities containing this fragment must
     * implement. This mechanism allows activities to be notified of item
     * selections.
     */
    public interface Callback{
        //detail callback for when an item has been selected
        public void onItemSelected(Uri dataUri);
    }

    public todolistFragment(){
        //생성자
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.todolist_fragment, menu);

    }
    @Override
    public boolean onOptionsSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.action_settings_location){
            //해당 동작 수행할 것. 호출 Activity
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_settings_NON){
            //do something
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        mTodoListAdapter = new todoListAdapter(getActivity(), null, 0);
        View rootView = inflater.inflate(R.layout.)

    }


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
