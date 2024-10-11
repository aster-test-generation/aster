import unittest
from ansible.modules.apt_repository import UbuntuSourcesList

class TestAptRepository(unittest.TestCase):
    def test_add_source(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertIn('deb http://archive.canonical.com/ubuntu hardy partner', sourceslist.sources)

    def test_remove_source(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_source('deb http://archive.canonical.com/ubuntu hardy partner')
        sourceslist.remove_source('deb http://archive.canonical.com/ubuntu hardy partner')
        self.assertNotIn('deb http://archive.canonical.com/ubuntu hardy partner', sourceslist.sources)

    def test_add_ppa_signing_key(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_ppa_signing_key('ppa:nginx/stable')
        self.assertIn('ppa:nginx/stable', sourceslist.sources)

    def test_remove_ppa_signing_key(self):
        sourceslist = UbuntuSourcesList()
        sourceslist.add_ppa_signing_key('ppa:nginx/stable')
        sourceslist.remove_ppa_signing_key('ppa:nginx/stable')
        self.assertNotIn('ppa:nginx/stable', sourceslist.sources)

if __name__ == '__main__':
    unittest.main()