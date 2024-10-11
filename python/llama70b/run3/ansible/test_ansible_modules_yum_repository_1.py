import unittest
from ansible.modules.yum_repository import YumRepository


class TestYumRepository(unittest.TestCase):
    def test___init__(self):
        instance = YumRepository()
        self.assertIsInstance(instance, YumRepository)

    def test___str__(self):
        instance = YumRepository()
        self.assertEqual(str(instance), "YumRepository")

    def test___repr__(self):
        instance = YumRepository()
        self.assertEqual(repr(instance), "YumRepository()")

    def test_run(self):
        instance = YumRepository()
        result = instance.run()
        self.assertIsNone(result)

    def test_create_repository(self):
        instance = YumRepository()
        result = instance.create_repository("epel", "EPEL YUM repo", "https://download.fedoraproject.org/pub/epel/$releasever/$basearch/")
        self.assertTrue(result)

    def test_update_repository(self):
        instance = YumRepository()
        result = instance.update_repository("epel", "EPEL YUM repo", "https://download.fedoraproject.org/pub/epel/$releasever/$basearch/")
        self.assertTrue(result)

    def test_delete_repository(self):
        instance = YumRepository()
        result = instance.delete_repository("epel")
        self.assertTrue(result)

    def test__get_repository_config(self):
        instance = YumRepository()
        result = instance._get_repository_config("epel")
        self.assertIsNone(result)

    def test__set_repository_config(self):
        instance = YumRepository()
        result = instance._set_repository_config("epel", {"description": "EPEL YUM repo", "baseurl": "https://download.fedoraproject.org/pub/epel/$releasever/$basearch/"})
        self.assertTrue(result)

    def test__get_repository_file(self):
        instance = YumRepository()
        result = instance._get_repository_file("epel")
        self.assertIsNone(result)

    def test__write_repository_file(self):
        instance = YumRepository()
        result = instance._write_repository_file("epel", {"description": "EPEL YUM repo", "baseurl": "https://download.fedoraproject.org/pub/epel/$releasever/$basearch/"})
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()