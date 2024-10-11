import unittest
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def test_add_method(self):
        yumrepo = YumRepo()
        yumrepo.add()
        self.assertEqual(yumrepo.state, 'present')

    def test_remove_method(self):
        yumrepo = YumRepo()
        yumrepo.remove()
        self.assertEqual(yumrepo.state, 'absent')

    def test_save_method(self):
        yumrepo = YumRepo()
        yumrepo.save()
        self.assertTrue(os.path.isfile(yumrepo.params['dest']))

    def test_dump_method(self):
        yumrepo = YumRepo()
        yumrepo.add()
        dump = yumrepo.dump()
        self.assertTrue(dump)

    def test_set_fs_attributes_if_different_method(self):
        yumrepo = YumRepo()
        file_args = {}
        changed = yumrepo.set_fs_attributes_if_different(file_args)
        self.assertFalse(changed)

    def test_load_file_common_arguments_method(self):
        yumrepo = YumRepo()
        file_args = yumrepo.load_file_common_arguments()
        self.assertTrue(file_args)

if __name__ == '__main__':
    unittest.main()