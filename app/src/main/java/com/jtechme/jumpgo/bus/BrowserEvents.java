package com.jtechme.jumpgo.bus;

/**
 * Created by Stefano Pacifici on 26/08/15.
 */
public final class BrowserEvents {

    private BrowserEvents() {
        // No instances
    }

    /**
     * Used to reply to the {@link com.jtechme.jumpgo.fragment.BookmarksFragment} message
     * {@link com.jtechme.jumpgo.bus.BookmarkEvents.WantToBookmarkCurrentPage}. The interaction
     * result is a new bookmark added.
     */
    public static class AddBookmark {
        public final String title, url;

        public AddBookmark(final String title, final String url) {
            this.title = title;
            this.url = url;
        }
    }

    /**
     * Used to reply to {@link com.jtechme.jumpgo.fragment.BookmarksFragment} message
     * {@link com.jtechme.jumpgo.bus.BookmarkEvents.WantInfoAboutCurrentPage}. This is generally
     * used to update the {@link com.jtechme.jumpgo.fragment.BookmarksFragment} interface.
     */
    public static class CurrentPageUrl {
        public final String url;

        public CurrentPageUrl(final String url) {
            this.url = url;
        }
    }

    /**
     * Notify the BookmarksFragment and TabsFragment that the user pressed the back button
     */
    public static class UserPressedBack {
    }
}
