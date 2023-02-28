package com.example.quwiclient.data;

import android.content.Context;

import com.example.quwiclient.data.local.prefs.PreferencesHelper;
import com.example.quwiclient.data.remote.ApiHeader;
import com.example.quwiclient.data.remote.ApiHelper;
import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager {

    private static final String TAG = "AppDataManager";

    private final ApiHelper mApiHelper;

    private final Context mContext;


    private final Gson mGson;

    private final PreferencesHelper mPreferencesHelper;

    @Inject
    public AppDataManager(Context context, PreferencesHelper preferencesHelper, ApiHelper apiHelper, Gson gson) {
        mContext = context;
        mPreferencesHelper = preferencesHelper;
        mApiHelper = apiHelper;
        mGson = gson;
    }

//    @Override
//    public Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request) {
//        return mApiHelper.doFacebookLoginApiCall(request);
//    }
//
//    @Override
//    public Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request) {
//        return mApiHelper.doGoogleLoginApiCall(request);
//    }
//
//    @Override
//    public Single<LogoutResponse> doLogoutApiCall() {
//        return mApiHelper.doLogoutApiCall();
//    }
//
//    @Override
//    public Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request) {
//        return mApiHelper.doServerLoginApiCall(request);
//    }

    @Override
    public String getAccessToken() {
        return mPreferencesHelper.getAccessToken();
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPreferencesHelper.setAccessToken(accessToken);
        mApiHelper.getApiHeader().getProtectedApiHeader().setAccessToken(accessToken);
    }

//    @Override
//    public Observable<List<Question>> getAllQuestions() {
//        return mDbHelper.getAllQuestions();
//    }
//
//    @Override
//    public Observable<List<User>> getAllUsers() {
//        return mDbHelper.getAllUsers();
//    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHelper.getApiHeader();
    }

//    @Override
//    public Single<BlogResponse> getBlogApiCall() {
//        return mApiHelper.getBlogApiCall();
//    }

    @Override
    public String getCurrentUserEmail() {
        return mPreferencesHelper.getCurrentUserEmail();
    }

    @Override
    public void setCurrentUserEmail(String email) {
        mPreferencesHelper.setCurrentUserEmail(email);
    }

    @Override
    public Long getCurrentUserId() {
        return mPreferencesHelper.getCurrentUserId();
    }

    @Override
    public void setCurrentUserId(Long userId) {
        mPreferencesHelper.setCurrentUserId(userId);
    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return mPreferencesHelper.getCurrentUserLoggedInMode();
    }

    @Override
    public void setCurrentUserLoggedInMode(LoggedInMode mode) {
        mPreferencesHelper.setCurrentUserLoggedInMode(mode);
    }

    @Override
    public String getCurrentUserName() {
        return mPreferencesHelper.getCurrentUserName();
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPreferencesHelper.setCurrentUserName(userName);
    }

    @Override
    public String getCurrentUserProfilePicUrl() {
        return mPreferencesHelper.getCurrentUserProfilePicUrl();
    }

    @Override
    public void setCurrentUserProfilePicUrl(String profilePicUrl) {
        mPreferencesHelper.setCurrentUserProfilePicUrl(profilePicUrl);
    }

//    @Override
//    public Single<OpenSourceResponse> getOpenSourceApiCall() {
//        return mApiHelper.getOpenSourceApiCall();
//    }
//
//    @Override
//    public Observable<List<Option>> getOptionsForQuestionId(Long questionId) {
//        return mDbHelper.getOptionsForQuestionId(questionId);
//    }
//
//    @Override
//    public Observable<List<QuestionCardData>> getQuestionCardData() {
//        return mDbHelper.getAllQuestions()
//                .flatMap(questions -> Observable.fromIterable(questions))
//                .flatMap(question -> Observable.zip(
//                        mDbHelper.getOptionsForQuestionId(question.id),
//                        Observable.just(question),
//                        (options, question1) -> new QuestionCardData(question1, options)))
//                .toList()
//                .toObservable();
//    }
//
//    @Override
//    public Observable<Boolean> insertUser(User user) {
//        return mDbHelper.insertUser(user);
//    }
//
//    @Override
//    public Observable<Boolean> isOptionEmpty() {
//        return mDbHelper.isOptionEmpty();
//    }
//
//    @Override
//    public Observable<Boolean> isQuestionEmpty() {
//        return mDbHelper.isQuestionEmpty();
//    }
//
//    @Override
//    public Observable<Boolean> saveOption(Option option) {
//        return mDbHelper.saveOption(option);
//    }
//
//    @Override
//    public Observable<Boolean> saveOptionList(List<Option> optionList) {
//        return mDbHelper.saveOptionList(optionList);
//    }
//
//    @Override
//    public Observable<Boolean> saveQuestion(Question question) {
//        return mDbHelper.saveQuestion(question);
//    }
//
//    @Override
//    public Observable<Boolean> saveQuestionList(List<Question> questionList) {
//        return mDbHelper.saveQuestionList(questionList);
//    }
//
//    @Override
//    public Observable<Boolean> seedDatabaseOptions() {
//        return mDbHelper.isOptionEmpty()
//                .concatMap(isEmpty -> {
//                    if (isEmpty) {
//                        Type type = new TypeToken<List<Option>>() {
//                        }.getType();
//                        List<Option> optionList = mGson.fromJson(CommonUtils.loadJSONFromAsset(mContext, AppConstants.SEED_DATABASE_OPTIONS), type);
//                        return saveOptionList(optionList);
//                    }
//                    return Observable.just(false);
//                });
//    }
//
//    @Override
//    public Observable<Boolean> seedDatabaseQuestions() {
//        return mDbHelper.isQuestionEmpty()
//                .concatMap(isEmpty -> {
//                    if (isEmpty) {
//                        Type type = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Question.class);
//                        List<Question> questionList = mGson
//                                .fromJson(CommonUtils.loadJSONFromAsset(mContext, AppConstants.SEED_DATABASE_QUESTIONS), type);
//                        return saveQuestionList(questionList);
//                    }
//                    return Observable.just(false);
//                });
//    }

    @Override
    public void setUserAsLoggedOut() {
        updateUserInfo(
                null,
                null,
                DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT,
                null,
                null,
                null);
    }

    @Override
    public void updateApiHeader(Long userId, String accessToken) {
        mApiHelper.getApiHeader().getProtectedApiHeader().setUserId(userId);
        mApiHelper.getApiHeader().getProtectedApiHeader().setAccessToken(accessToken);
    }

    @Override
    public void updateUserInfo(
            String accessToken,
            Long userId,
            LoggedInMode loggedInMode,
            String userName,
            String email,
            String profilePicPath) {

        setAccessToken(accessToken);
        setCurrentUserId(userId);
        setCurrentUserLoggedInMode(loggedInMode);
        setCurrentUserName(userName);
        setCurrentUserEmail(email);
        setCurrentUserProfilePicUrl(profilePicPath);

        updateApiHeader(userId, accessToken);
    }
}