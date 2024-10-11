import unittest
from ansible.modules.apt_repository import sources_list


class TestUbuntuSourcesList(unittest.TestCase):
    def test_add_source(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertIn('deb http://archive.canonical.com/ubuntu hardy partner', sourceslist.sources)

    def test_remove_source(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        sourceslist.remove_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertNotIn('deb http://archive.canonical.com/ubuntu hardy partner', sourceslist.sources)

    def test_save(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        sourceslist.save()
        with open('/etc/apt/sources.list', 'r') as f:
            content = f.read()
            self.assertIn('deb http://archive.canonical.com/ubuntu hardy partner', content)

if __name__ == '__main__':
    unittest.main()