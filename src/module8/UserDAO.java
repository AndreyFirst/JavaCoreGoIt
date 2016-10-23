package module8;

import java.util.List;


public class UserDAO extends AbstactDAOImlp {

    public User save (User user)
    {
        super.save(user);
        return user;
    }

    public void delete (User user)
    {
        super.delete(user);
    }
    public void deleteall (List<User> userList)
    {
        super.deleteAll(userList);
    }
    public void saveall (List<User> userList)
    {
        super.saveAll(userList);
    }

    public List<User> userList(){
        return super.getList();
    }


    public void deleteById (long id)
    {
        List<User> userList = super.getList();
        int index = 0;
        for (User user : userList) {
            if (id == user.getId()) {
                super.deleteById(index);
            }
            index++;
        }

    }

    public User get (long id)
    {

        List<User> userList = super.getList();
        int index = 0;
        for (User user : userList) {
            if (id == user.getId()) {
                return (User)super.get(index);
            }
            index++;
        }
        return null;
    }

}