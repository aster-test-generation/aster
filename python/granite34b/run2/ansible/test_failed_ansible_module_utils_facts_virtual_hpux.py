import re
import os
import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector

class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual_facts = {}
        host_tech = set()
        guest_tech = set()
        if os.path.exists('/usr/sbin/vecheck'):
            rc, out, err = self.module.run_command("/usr/sbin/vecheck")
            if rc == 0:
                guest_tech.add('HP vPar')
                virtual_facts['virtualization_type'] = 'guest'
                virtual_facts['virtualization_role'] = 'HP vPar'
        if os.path.exists('/opt/hpvm/bin/hpvminfo'):
            rc, out, err = self.module.run_command("/opt/hpvm/bin/hpvminfo")
            if rc == 0 and re.match('.*Running.*HPVM vPar.*', out):
                guest_tech.add('HPVM vPar')
                virtual_facts['virtualization_type'] = 'guest'
                virtual_facts['virtualization_role'] = 'HPVM vPar'
            elif rc == 0 and re.match('.*Running.*HPVM guest.*', out):
                guest_tech.add('HPVM IVM')
                virtual_facts['virtualization_type'] = 'guest'
                virtual_facts['virtualization_role'] = 'HPVM IVM'
            elif rc == 0 and re.match('.*Running.*HPVM host.*', out):
                guest_tech.add('HPVM')
                virtual_facts['virtualization_type'] = 'host'
                virtual_facts['virtualization_role'] = 'HPVM'
        if os.path.exists('/usr/sbin/parstatus'):
            rc, out, err = self.module.run_command("/usr/sbin/parstatus")
            if rc == 0:
                guest_tech.add('HP nPar')
                virtual_facts['virtualization_type'] = 'guest'
                virtual_facts['virtualization_role'] = 'HP nPar'
        virtual_facts['virtualization_tech_guest'] = guest_tech
        virtual_facts['virtualization_tech_host'] = host_tech
        self.assertEqual(virtual_facts, {'virtualization_tech_guest': set(), 'virtualization_tech_host': set()})

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_collect(self):
        collector = HPUXVirtualCollector()
        result = collector.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()